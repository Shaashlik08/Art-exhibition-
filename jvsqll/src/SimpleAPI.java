import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.sql.*;

public class SimpleAPI {

    public static void main(String[] args) throws IOException {
        // Создаем сервак
        HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);
        
        // Добавляем два пути для солидности
        server.createContext("/artists", new ArtistHandler());
        server.createContext("/artworks", new ArtworkHandler());
        
        server.setExecutor(null); 
        System.out.println("Сервер запущен! Проверяй тут:");
        System.out.println("http://localhost:8080/artists");
        System.out.println("http://localhost:8080/artworks");
        server.start();
    }

    // Обработчик для Артистов
    static class ArtistHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange exchange) throws IOException {
            sendJsonResponse(exchange, "SELECT * FROM artist", "artist");
        }
    }

    // Обработчик для Картин
    static class ArtworkHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange exchange) throws IOException {
            sendJsonResponse(exchange, "SELECT * FROM artwork", "artwork");
        }
    }

    // Общий метод, чтобы не дублировать код (студенческий лайфхак)
    private static void sendJsonResponse(HttpExchange exchange, String query, String table) throws IOException {
        StringBuilder json = new StringBuilder("[");
        try (Connection conn = DBConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            
            while (rs.next()) {
                if (table.equals("artist")) {
                    json.append(String.format("{\"id\":%d, \"name\":\"%s\", \"country\":\"%s\"}",
                            rs.getInt("id"), rs.getString("name"), rs.getString("country")));
                } else {
                    json.append(String.format("{\"id\":%d, \"title\":\"%s\", \"year\":%d}",
                            rs.getInt("id"), rs.getString("title"), rs.getInt("year")));
                }
                if (!rs.isLast()) json.append(",");
            }
            json.append("]");
            
            byte[] response = json.toString().getBytes();
            exchange.getResponseHeaders().set("Content-Type", "application/json");
            exchange.sendResponseHeaders(200, response.length);
            OutputStream os = exchange.getResponseBody();
            os.write(response);
            os.close();
            
        } catch (Exception e) {
            String error = "{\"error\":\"" + e.getMessage() + "\"}";
            exchange.sendResponseHeaders(500, error.length());
            exchange.getResponseBody().write(error.getBytes());
            exchange.getResponseBody().close();
        }
    }
}
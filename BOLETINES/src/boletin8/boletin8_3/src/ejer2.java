public class ejer2 {
    public static void main(String[] args) {
    int index = text.indexOf("\n");
    String title;
    String content;

        if (index != -1) {
        title = text.substring(0, index);
        content = text.substring(index + 1);
    } else {
        title = text;
        content = "No hay contenido.";
    }

    // Construir HTML
    String html = "<html>\n";
    html += "<head><title>" + title + "</title></head>\n";
    html += "<body>\n";
    html += "  <h1>" + title + "</h1>\n";
    html += "  <p>" + content + "</p>\n";
    html += "</body>\n";
    html += "</html>";

    // Mostrar el HTML en consola
        System.out.println(html);
}

public static void main(String[] args) {
    String inputText = "Título de prueba\nEste es el contenido de la página.";
    generateHTML(inputText);
    }
}
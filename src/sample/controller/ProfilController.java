package sample.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ProfilController {
    @FXML
    private Label lbUsername;
    @FXML
    private AnchorPane profilPane;
    @FXML
    private Button btnBackProfil;


    /**
     * Methode von Zuweisung eines Buttons
     * @param event Anzeigen des GUI "Start"
     * @throws IOException
     */

  //  Methode der Rückkehr eines Profiles
    public void handleBtnBackProfil(ActionEvent event) throws IOException {
        AnchorPane newPane = FXMLLoader.load(getClass().getResource("../view/Start.fxml"));
        profilPane.getChildren().setAll(newPane);
    }
    private void testGet() throws IOException {
        try (CloseableHttpClient httpclient = HttpClients.createDefault()) {
            HttpGet httpGet = new HttpGet("https://www.sharing-time/user");
            System.out.println(httpGet.getRequestLine());
            httpGet.getHeaders("username");
            System.out.println("******");

            // The underlying HTTP connection is still held by the response object
            // to allow the response content to be streamed directly from the network socket.
            // In order to ensure correct deallocation of system resources
            // the user MUST call CloseableHttpResponse#close() from a finally clause.
            // Please note that if response content is not fully consumed the underlying
            // connection cannot be safely re-used and will be shut down and discarded
            // by the connection manager.
            try (CloseableHttpResponse response1 = httpclient.execute(httpGet)) {
                // System.out.println(response1.getCode() + " " + response1.getReasonPhrase());.
                HttpEntity entity1 = response1.getEntity();
                // EntityUtils.consume(entity1);
                //FileWriter fileWriter = new FileWriter("result.json");

                try (OutputStream outputStream = Files.newOutputStream(Paths.get("user.txt"))) {
                    long length = entity1.getContent().transferTo(outputStream);
                    System.out.println("Bytes uebertragen: " + length);
                }
            }
        }
    }
}

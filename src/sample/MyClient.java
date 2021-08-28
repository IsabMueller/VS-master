package sample;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

public class MyClient {


    private void testGet() throws IOException {
        try (CloseableHttpClient httpclient = HttpClients.createDefault()) {
            HttpGet httpGet = new HttpGet("http://www.htwsaar.de");
            System.out.println("******");
            // The underlying HTTP connection is still held by the response object
            // to allow the response content to be streamed directly from the network socket.
            // In order to ensure correct deallocation of system resources
            // the user MUST call CloseableHttpResponse#close() from a finally clause.
            // Please note that if response content is not fully consumed the underlying
            // connection cannot be safely re-used and will be shut down and discarded
            // by the connection manager.
            try (CloseableHttpResponse response1 = httpclient.execute(httpGet)) {
                // System.out.println(response1.getCode() + " " + response1.getReasonPhrase());
                HttpEntity entity1 = response1.getEntity();
                // EntityUtils.consume(entity1);
                //FileWriter fileWriter = new FileWriter("result.json");

                try (OutputStream outputStream = Files.newOutputStream(Paths.get("htw.html"))) {
                    long length = entity1.getContent().transferTo(outputStream);
                    System.out.println("Bytes uebertragen: " + length);
                }
            }
        }
    }

    private void testPost() throws IOException {
        try (CloseableHttpClient httpclient = HttpClients.createDefault()) {
            HttpPost httpPost = new HttpPost("https://www.sharing-time.rest/auth/login");
            List<NameValuePair> nvps = new ArrayList<>();
            nvps.add(new BasicNameValuePair("username", "Mharasch"));
            nvps.add(new BasicNameValuePair("password", "test"));
            httpPost.setEntity(new UrlEncodedFormEntity(nvps));

            try (CloseableHttpResponse response2 = httpclient.execute(httpPost)) {
                // System.out.println(response2.getCode() + " " + response2.getReasonPhrase());
                HttpEntity entity2 = response2.getEntity();
                // do something useful with the response body
                // and ensure it is fully consumed
                try (OutputStream outputStream = Files.newOutputStream(Paths.get("post.txt"))) {
                    long length = entity2.getContent().transferTo(outputStream);
                    System.out.println("Bytes uebertragen: " + length);
                    //   terminService.saveTermin(new TerminEntity());
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        MyClient myClient = new MyClient();
        //myClient.testGet();
        myClient.testPost();
    }
}

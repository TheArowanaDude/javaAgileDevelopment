package webISS;
import org.json.JSONObject;
import webISS.OpenNotifyWebService.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public interface ISSWebService {

  static long fetchIssFlyOverData(double latitude, double longitude) throws Exception
  {
    String requestURL = "http://api.open-notify.org/iss-pass.json?lat=" + latitude + "&lon=" + longitude + "&n=1";

    URL request = new URL(requestURL);
    HttpURLConnection connection = (HttpURLConnection) request.openConnection();

    connection.setRequestMethod("GET");

    BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
    StringBuffer response = new StringBuffer();
    String inputLine;

    while ((inputLine = in.readLine()) != null) {
      response.append(inputLine);
    }


    return Long.parseLong(
            OpenNotifyWebService.parseJSON(response.toString()));

  }
}
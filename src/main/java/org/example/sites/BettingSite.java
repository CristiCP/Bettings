package org.example.sites;

import java.util.List;
import java.util.Map;

public interface BettingSite {
    String getAllMatchesContent() throws Throwable;

    String getMatchContent(Integer matchId) throws Throwable;

    Map<Integer, List<List<String>>> getMatchesInformation(String response);

    Map<String, Map<String, String>> getMatchMarkets(String response);

    String getSiteName();

    Integer getFootballId();

    Integer getTennisId();

    String getTotalSuturiPePoarta();

    String getTotalSuturiPePoartaEchipa();

    String getTotalSuturi();

    String getTotalSuturiEchipa();

    String getTotalCartonase();

    String getTotalCartonaseEchipa();

    String getTotalCornere();

    String getTotalCornereEchipa();

    String getPrimaReprizaTotalCornere();

    String getPrimaReprizaTotalCornereEchipa();

    String getTotalGoluri();

    String getTotalGoluriEchipa();

    String getPrimaReprizaTotalGoluri();

    String getPrimaReprizaTotalGoluriEchipa();

    String getADouaReprizaTotalGoluriEchipa();

    String getTotalOfsaiduri();

    String getTotalOfsaiduriEchipa();

    String getTotalFaulturi();

    String getTotalFaulturiEchipa();

    String getTotalGameuri();

    String getTotalGameuriSetul1();

    String getTotalGameuriJucator();

    String getTotalSeturi();

    String getSplitter();
}
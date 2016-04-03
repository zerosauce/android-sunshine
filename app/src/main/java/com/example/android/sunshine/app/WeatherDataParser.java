package com.example.android.sunshine.app;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class WeatherDataParser {
    public static double getMaxTemperatureForDay(String weatherJsonStr, int dayIndex)
            throws JSONException {
        JSONObject weatherJsonObject = new JSONObject(weatherJsonStr);
        JSONArray weatherJsonArray = weatherJsonObject.getJSONArray("list");
        JSONObject weatherDayJson = weatherJsonArray.getJSONObject(dayIndex);
        JSONObject weatherDayTempJson = weatherDayJson.getJSONObject("temp");
        return Double.parseDouble(weatherDayTempJson.get("max").toString());
    }
}

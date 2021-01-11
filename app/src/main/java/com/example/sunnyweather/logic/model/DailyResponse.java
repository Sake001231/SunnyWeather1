package com.example.sunnyweather.logic.model;

import com.google.gson.annotations.SerializedName;

import java.util.Date;
import java.util.List;

import javax.xml.transform.Result;

public class DailyResponse {
    public String status;
    public Result result;

    public class LifeDescription{
        public String val;
    }
    public class LifeIndex{
        public List<LifeDescription> coldRisk;
        public List<LifeDescription> carWashing;
        public List<LifeDescription> ultraviolet;
        public List<LifeDescription> dressing;
    }
    public class Skycon{
        public String value;
        public Date date;
    }
    public class Temperature{
        public Float max;
        public Float min;
    }
    public class Daily{
        public List<Temperature> temperature;
        public List<Skycon>skycon;
        @SerializedName("life_index")
        public LifeIndex lifeIndex;

    }
    public class Result{
        public Daily daily;
    }
}

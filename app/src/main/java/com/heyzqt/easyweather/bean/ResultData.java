package com.heyzqt.easyweather.bean;

import com.google.gson.JsonObject;

/**
 * Created by heyzqt on 2019/4/11.
 */
@SuppressWarnings("ALL")
public class ResultData {
    /**
     * time : 2019-04-12 09:44:08
     * cityInfo : {"city":"天津市","cityId":"101030100","parent":"天津","updateTime":"07:48"}
     * date : 20190412
     * message : Success !
     * status : 200
     * data : {"shidu":"65%","pm25":106,"pm10":0,"quality":"轻度污染","wendu":"10","ganmao":"儿童、老年人及心脏、呼吸系统疾病患者人群应减少长时间或高强度户外锻炼","yesterday":{"date":"11","sunrise":"05:43","high":"高温 16.0℃","low":"低温 7
     * .0℃","sunset":"18:43","aqi":115,"ymd":"2019-04-11","week":"星期四","fx":"东南风","fl":"3-4级","type":"阵雨","notice":"阵雨来袭，出门记得带伞"},"forecast":[{"date":"12","sunrise":"05:42","high":"高温 22.0℃",
     * "low":"低温 10.0℃","sunset":"18:44","aqi":138,"ymd":"2019-04-12","week":"星期五","fx":"西南风","fl":"3-4级","type":"多云","notice":"阴晴之间，谨防紫外线侵扰"},{"date":"13","sunrise":"05:40","high":"高温 21.0℃",
     * "low":"低温 10.0℃","sunset":"18:45","aqi":71,"ymd":"2019-04-13","week":"星期六","fx":"北风","fl":"3-4级","type":"多云","notice":"阴晴之间，谨防紫外线侵扰"},{"date":"14","sunrise":"05:39","high":"高温 20.0℃",
     * "low":"低温 9.0℃","sunset":"18:46","aqi":55,"ymd":"2019-04-14","week":"星期日","fx":"西北风","fl":"3-4级","type":"晴","notice":"愿你拥有比阳光明媚的心情"},{"date":"15","sunrise":"05:37","high":"高温 25.0℃",
     * "low":"低温 12.0℃","sunset":"18:47","aqi":84,"ymd":"2019-04-15","week":"星期一","fx":"西南风","fl":"3-4级","type":"晴","notice":"愿你拥有比阳光明媚的心情"},{"date":"16","sunrise":"05:36","high":"高温 26.0℃",
     * "low":"低温 13.0℃","sunset":"18:48","aqi":81,"ymd":"2019-04-16","week":"星期二","fx":"西南风","fl":"3-4级","type":"晴","notice":"愿你拥有比阳光明媚的心情"},{"date":"17","sunrise":"05:35","high":"高温 27.0℃",
     * "low":"低温 15.0℃","sunset":"18:49","aqi":108,"ymd":"2019-04-17","week":"星期三","fx":"西南风","fl":"3-4级","type":"晴","notice":"愿你拥有比阳光明媚的心情"},{"date":"18","sunrise":"05:33","high":"高温 22.0℃",
     * "low":"低温 15.0℃","sunset":"18:50","ymd":"2019-04-18","week":"星期四","fx":"东南风","fl":"4-5级","type":"多云","notice":"阴晴之间，谨防紫外线侵扰"},{"date":"19","sunrise":"05:32","high":"高温 24.0℃","low":"低温 12
     * .0℃","sunset":"18:51","ymd":"2019-04-19","week":"星期五","fx":"东南风","fl":"<3级","type":"小雨","notice":"雨虽小，注意保暖别感冒"},{"date":"20","sunrise":"05:30","high":"高温 21.0℃","low":"低温 10.0℃",
     * "sunset":"18:52","ymd":"2019-04-20","week":"星期六","fx":"东风","fl":"3-4级","type":"阴","notice":"不要被阴云遮挡住好心情"},{"date":"21","sunrise":"05:29","high":"高温 20.0℃","low":"低温 12.0℃","sunset":"18:53",
     * "ymd":"2019-04-21","week":"星期日","fx":"南风","fl":"3-4级","type":"多云","notice":"阴晴之间，谨防紫外线侵扰"},{"date":"22","sunrise":"05:27","high":"高温 25.0℃","low":"低温 11.0℃","sunset":"18:54",
     * "ymd":"2019-04-22","week":"星期一","fx":"东风","fl":"3-4级","type":"小雨","notice":"雨虽小，注意保暖别感冒"},{"date":"23","sunrise":"05:26","high":"高温 21.0℃","low":"低温 12.0℃","sunset":"18:55",
     * "ymd":"2019-04-23","week":"星期二","fx":"西南风","fl":"3-4级","type":"小雨","notice":"雨虽小，注意保暖别感冒"},{"date":"24","sunrise":"05:25","high":"高温 20.0℃","low":"低温 10.0℃","sunset":"18:56",
     * "ymd":"2019-04-24","week":"星期三","fx":"东风","fl":"4-5级","type":"阴","notice":"不要被阴云遮挡住好心情"},{"date":"25","sunrise":"05:23","high":"高温 19.0℃","low":"低温 10.0℃","sunset":"18:57",
     * "ymd":"2019-04-25","week":"星期四","fx":"东南风","fl":"3-4级","type":"多云","notice":"阴晴之间，谨防紫外线侵扰"},{"date":"26","sunrise":"05:22","high":"高温 19.0℃","low":"低温 11.0℃","sunset":"18:58",
     * "ymd":"2019-04-26","week":"星期五","fx":"东南风","fl":"3-4级","type":"小雨","notice":"雨虽小，注意保暖别感冒"}]}
     */

    private String time;
    private CityInfoBean cityInfo;
    private String date;
    private String message;
    private int status;
    private JsonObject data;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public CityInfoBean getCityInfo() {
        return cityInfo;
    }

    public void setCityInfo(CityInfoBean cityInfo) {
        this.cityInfo = cityInfo;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public JsonObject getData() {
        return data;
    }

    public void setData(JsonObject data) {
        this.data = data;
    }

    public static class CityInfoBean {
        /**
         * city : 天津市
         * cityId : 101030100
         * parent : 天津
         * updateTime : 07:48
         */

        private String city;
        private String cityId;
        private String parent;
        private String updateTime;

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getCityId() {
            return cityId;
        }

        public void setCityId(String cityId) {
            this.cityId = cityId;
        }

        public String getParent() {
            return parent;
        }

        public void setParent(String parent) {
            this.parent = parent;
        }

        public String getUpdateTime() {
            return updateTime;
        }

        public void setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
        }
    }

//    public static class DataBean {
//        /**
//         * shidu : 65%
//         * pm25 : 106
//         * pm10 : 0
//         * quality : 轻度污染
//         * wendu : 10
//         * ganmao : 儿童、老年人及心脏、呼吸系统疾病患者人群应减少长时间或高强度户外锻炼
//         * yesterday : {"date":"11","sunrise":"05:43","high":"高温 16.0℃","low":"低温 7.0℃","sunset":"18:43","aqi":115,"ymd":"2019-04-11","week":"星期四","fx":"东南风","fl":"3-4级","type":"阵雨",
//         * "notice":"阵雨来袭，出门记得带伞"}
//         * forecast : [{"date":"12","sunrise":"05:42","high":"高温 22.0℃","low":"低温 10.0℃","sunset":"18:44","aqi":138,"ymd":"2019-04-12","week":"星期五","fx":"西南风","fl":"3-4级","type":"多云",
//         * "notice":"阴晴之间，谨防紫外线侵扰"},{"date":"13","sunrise":"05:40","high":"高温 21.0℃","low":"低温 10.0℃","sunset":"18:45","aqi":71,"ymd":"2019-04-13","week":"星期六","fx":"北风","fl":"3-4级","type":"多云",
//         * "notice":"阴晴之间，谨防紫外线侵扰"},{"date":"14","sunrise":"05:39","high":"高温 20.0℃","low":"低温 9.0℃","sunset":"18:46","aqi":55,"ymd":"2019-04-14","week":"星期日","fx":"西北风","fl":"3-4级","type":"晴",
//         * "notice":"愿你拥有比阳光明媚的心情"},{"date":"15","sunrise":"05:37","high":"高温 25.0℃","low":"低温 12.0℃","sunset":"18:47","aqi":84,"ymd":"2019-04-15","week":"星期一","fx":"西南风","fl":"3-4级","type":"晴",
//         * "notice":"愿你拥有比阳光明媚的心情"},{"date":"16","sunrise":"05:36","high":"高温 26.0℃","low":"低温 13.0℃","sunset":"18:48","aqi":81,"ymd":"2019-04-16","week":"星期二","fx":"西南风","fl":"3-4级","type":"晴",
//         * "notice":"愿你拥有比阳光明媚的心情"},{"date":"17","sunrise":"05:35","high":"高温 27.0℃","low":"低温 15.0℃","sunset":"18:49","aqi":108,"ymd":"2019-04-17","week":"星期三","fx":"西南风","fl":"3-4级","type":"晴",
//         * "notice":"愿你拥有比阳光明媚的心情"},{"date":"18","sunrise":"05:33","high":"高温 22.0℃","low":"低温 15.0℃","sunset":"18:50","ymd":"2019-04-18","week":"星期四","fx":"东南风","fl":"4-5级","type":"多云",
//         * "notice":"阴晴之间，谨防紫外线侵扰"},{"date":"19","sunrise":"05:32","high":"高温 24.0℃","low":"低温 12.0℃","sunset":"18:51","ymd":"2019-04-19","week":"星期五","fx":"东南风","fl":"<3级","type":"小雨",
//         * "notice":"雨虽小，注意保暖别感冒"},{"date":"20","sunrise":"05:30","high":"高温 21.0℃","low":"低温 10.0℃","sunset":"18:52","ymd":"2019-04-20","week":"星期六","fx":"东风","fl":"3-4级","type":"阴",
//         * "notice":"不要被阴云遮挡住好心情"},{"date":"21","sunrise":"05:29","high":"高温 20.0℃","low":"低温 12.0℃","sunset":"18:53","ymd":"2019-04-21","week":"星期日","fx":"南风","fl":"3-4级","type":"多云",
//         * "notice":"阴晴之间，谨防紫外线侵扰"},{"date":"22","sunrise":"05:27","high":"高温 25.0℃","low":"低温 11.0℃","sunset":"18:54","ymd":"2019-04-22","week":"星期一","fx":"东风","fl":"3-4级","type":"小雨",
//         * "notice":"雨虽小，注意保暖别感冒"},{"date":"23","sunrise":"05:26","high":"高温 21.0℃","low":"低温 12.0℃","sunset":"18:55","ymd":"2019-04-23","week":"星期二","fx":"西南风","fl":"3-4级","type":"小雨",
//         * "notice":"雨虽小，注意保暖别感冒"},{"date":"24","sunrise":"05:25","high":"高温 20.0℃","low":"低温 10.0℃","sunset":"18:56","ymd":"2019-04-24","week":"星期三","fx":"东风","fl":"4-5级","type":"阴",
//         * "notice":"不要被阴云遮挡住好心情"},{"date":"25","sunrise":"05:23","high":"高温 19.0℃","low":"低温 10.0℃","sunset":"18:57","ymd":"2019-04-25","week":"星期四","fx":"东南风","fl":"3-4级","type":"多云",
//         * "notice":"阴晴之间，谨防紫外线侵扰"},{"date":"26","sunrise":"05:22","high":"高温 19.0℃","low":"低温 11.0℃","sunset":"18:58","ymd":"2019-04-26","week":"星期五","fx":"东南风","fl":"3-4级","type":"小雨",
//         * "notice":"雨虽小，注意保暖别感冒"}]
//         */
//
//        private String shidu;
//        private int pm25;
//        private int pm10;
//        private String quality;
//        private String wendu;
//        private String ganmao;
//        private YesterdayBean yesterday;
//        private List<ForecastBean> forecast;
//
//        public String getShidu() {
//            return shidu;
//        }
//
//        public void setShidu(String shidu) {
//            this.shidu = shidu;
//        }
//
//        public int getPm25() {
//            return pm25;
//        }
//
//        public void setPm25(int pm25) {
//            this.pm25 = pm25;
//        }
//
//        public int getPm10() {
//            return pm10;
//        }
//
//        public void setPm10(int pm10) {
//            this.pm10 = pm10;
//        }
//
//        public String getQuality() {
//            return quality;
//        }
//
//        public void setQuality(String quality) {
//            this.quality = quality;
//        }
//
//        public String getWendu() {
//            return wendu;
//        }
//
//        public void setWendu(String wendu) {
//            this.wendu = wendu;
//        }
//
//        public String getGanmao() {
//            return ganmao;
//        }
//
//        public void setGanmao(String ganmao) {
//            this.ganmao = ganmao;
//        }
//
//        public YesterdayBean getYesterday() {
//            return yesterday;
//        }
//
//        public void setYesterday(YesterdayBean yesterday) {
//            this.yesterday = yesterday;
//        }
//
//        public List<ForecastBean> getForecast() {
//            return forecast;
//        }
//
//        public void setForecast(List<ForecastBean> forecast) {
//            this.forecast = forecast;
//        }
//
//        public static class YesterdayBean {
//            /**
//             * date : 11
//             * sunrise : 05:43
//             * high : 高温 16.0℃
//             * low : 低温 7.0℃
//             * sunset : 18:43
//             * aqi : 115
//             * ymd : 2019-04-11
//             * week : 星期四
//             * fx : 东南风
//             * fl : 3-4级
//             * type : 阵雨
//             * notice : 阵雨来袭，出门记得带伞
//             */
//
//            private String date;
//            private String sunrise;
//            private String high;
//            private String low;
//            private String sunset;
//            private int aqi;
//            private String ymd;
//            private String week;
//            private String fx;
//            private String fl;
//            private String type;
//            private String notice;
//
//            public String getDate() {
//                return date;
//            }
//
//            public void setDate(String date) {
//                this.date = date;
//            }
//
//            public String getSunrise() {
//                return sunrise;
//            }
//
//            public void setSunrise(String sunrise) {
//                this.sunrise = sunrise;
//            }
//
//            public String getHigh() {
//                return high;
//            }
//
//            public void setHigh(String high) {
//                this.high = high;
//            }
//
//            public String getLow() {
//                return low;
//            }
//
//            public void setLow(String low) {
//                this.low = low;
//            }
//
//            public String getSunset() {
//                return sunset;
//            }
//
//            public void setSunset(String sunset) {
//                this.sunset = sunset;
//            }
//
//            public int getAqi() {
//                return aqi;
//            }
//
//            public void setAqi(int aqi) {
//                this.aqi = aqi;
//            }
//
//            public String getYmd() {
//                return ymd;
//            }
//
//            public void setYmd(String ymd) {
//                this.ymd = ymd;
//            }
//
//            public String getWeek() {
//                return week;
//            }
//
//            public void setWeek(String week) {
//                this.week = week;
//            }
//
//            public String getFx() {
//                return fx;
//            }
//
//            public void setFx(String fx) {
//                this.fx = fx;
//            }
//
//            public String getFl() {
//                return fl;
//            }
//
//            public void setFl(String fl) {
//                this.fl = fl;
//            }
//
//            public String getType() {
//                return type;
//            }
//
//            public void setType(String type) {
//                this.type = type;
//            }
//
//            public String getNotice() {
//                return notice;
//            }
//
//            public void setNotice(String notice) {
//                this.notice = notice;
//            }
//        }
//
//        public static class ForecastBean {
//            /**
//             * date : 12
//             * sunrise : 05:42
//             * high : 高温 22.0℃
//             * low : 低温 10.0℃
//             * sunset : 18:44
//             * aqi : 138
//             * ymd : 2019-04-12
//             * week : 星期五
//             * fx : 西南风
//             * fl : 3-4级
//             * type : 多云
//             * notice : 阴晴之间，谨防紫外线侵扰
//             */
//
//            private String date;
//            private String sunrise;
//            private String high;
//            private String low;
//            private String sunset;
//            private int aqi;
//            private String ymd;
//            private String week;
//            private String fx;
//            private String fl;
//            private String type;
//            private String notice;
//
//            public String getDate() {
//                return date;
//            }
//
//            public void setDate(String date) {
//                this.date = date;
//            }
//
//            public String getSunrise() {
//                return sunrise;
//            }
//
//            public void setSunrise(String sunrise) {
//                this.sunrise = sunrise;
//            }
//
//            public String getHigh() {
//                return high;
//            }
//
//            public void setHigh(String high) {
//                this.high = high;
//            }
//
//            public String getLow() {
//                return low;
//            }
//
//            public void setLow(String low) {
//                this.low = low;
//            }
//
//            public String getSunset() {
//                return sunset;
//            }
//
//            public void setSunset(String sunset) {
//                this.sunset = sunset;
//            }
//
//            public int getAqi() {
//                return aqi;
//            }
//
//            public void setAqi(int aqi) {
//                this.aqi = aqi;
//            }
//
//            public String getYmd() {
//                return ymd;
//            }
//
//            public void setYmd(String ymd) {
//                this.ymd = ymd;
//            }
//
//            public String getWeek() {
//                return week;
//            }
//
//            public void setWeek(String week) {
//                this.week = week;
//            }
//
//            public String getFx() {
//                return fx;
//            }
//
//            public void setFx(String fx) {
//                this.fx = fx;
//            }
//
//            public String getFl() {
//                return fl;
//            }
//
//            public void setFl(String fl) {
//                this.fl = fl;
//            }
//
//            public String getType() {
//                return type;
//            }
//
//            public void setType(String type) {
//                this.type = type;
//            }
//
//            public String getNotice() {
//                return notice;
//            }
//
//            public void setNotice(String notice) {
//                this.notice = notice;
//            }
//        }
//    }

//    private String data;
//    private String msg;
//    private String status;
//    private String code;
//
//    public String getData() {
//        return data;
//    }
//
//    public void setData(String data) {
//        this.data = data;
//    }
//
//    public String getMsg() {
//        return msg;
//    }
//
//    public void setMsg(String msg) {
//        this.msg = msg;
//    }
//
//    public String getStatus() {
//        return status;
//    }
//
//    public void setStatus(String status) {
//        this.status = status;
//    }
//
//    public String getCode() {
//        return code;
//    }
//
//    public void setCode(String code) {
//        this.code = code;
//    }
}

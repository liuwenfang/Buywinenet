package com.ccp.buywinenet.model.bean;

import java.util.List;

/**
 * 作者：刘小芳2020-05-13 15:46
 * 邮箱：ccpchick@163.com
 * desc：蜡笔小新的烦恼
 */
public class SecKill {


    /**
     * status : true
     * msg : 查询成功
     * code : 30000
     * data : [{"Type":"A","AppSeckill":{"Id":475,"StarTime":"2020-05-11 10:00:00","CurrTime":"2020-05-13 15:42:22","EndTime":"2020-05-14 09:59:59","state":0,"Remarks":"","AppSeckillProList":[{"Id":1839,"Pro_ProductId":7473,"Price":99,"ProductName":"52度 鸭溪窖 珍品酒 460ml（贵州老八大名酒）","imgUrl":"2019/0722/bd938fb9d10349009f70e6ca497dcd70.jpg","Num":50,"LimitNum":50,"OdrPrice":109,"IsRemind":0,"RemindID":0,"state":0,"Content":"窖香浓郁 绵柔净爽","StarTime":"2020-05-11 10:00:00","EndTime":"2020-05-14 09:59:59","CurrTime":"2020-05-13 15:42:23"},{"Id":1840,"Pro_ProductId":453,"Price":298,"ProductName":"52度 四特 东方韵 雅韵 500ml","imgUrl":"2018/0403/226b75b3bde24effa7cd54b2c553ccb0.jpg","Num":50,"LimitNum":50,"OdrPrice":308,"IsRemind":0,"RemindID":0,"state":0,"Content":"清香醇纯 回味无穷","StarTime":"2020-05-11 10:00:00","EndTime":"2020-05-14 09:59:59","CurrTime":"2020-05-13 15:42:23"},{"Id":1841,"Pro_ProductId":5924,"Price":99,"ProductName":"中国 张裕 窖藏 圆桶装 优选级 解百纳红葡萄酒 750ml","imgUrl":"2015/0203/f57b9d64f9374647a8ebb0ccad885d4f.jpg","Num":50,"LimitNum":50,"OdrPrice":109,"IsRemind":0,"RemindID":0,"state":0,"Content":"品质佳酿","StarTime":"2020-05-11 10:00:00","EndTime":"2020-05-14 09:59:59","CurrTime":"2020-05-13 15:42:23"},{"Id":1842,"Pro_ProductId":7857,"Price":128,"ProductName":"意大利 查理玛尔维萨甜白高泡葡萄酒 750ml","imgUrl":"2019/0112/67c696e9be2747208f282bc15dc00c4f.jpg","Num":50,"LimitNum":50,"OdrPrice":168,"IsRemind":0,"RemindID":0,"state":0,"Content":"品质佳酿","StarTime":"2020-05-11 10:00:00","EndTime":"2020-05-14 09:59:59","CurrTime":"2020-05-13 15:42:23"}]}}]
     * Version : {"Major":1,"Minor":1,"Build":-1,"Revision":-1,"MajorRevision":-1,"MinorRevision":-1}
     * Content : null
     * StatusCode : 200
     * ReasonPhrase : OK
     * Headers : []
     * RequestMessage : null
     * IsSuccessStatusCode : true
     */

    private boolean status;
    private String msg;
    private int code;
    private VersionBean Version;
    private Object Content;
    private int StatusCode;
    private String ReasonPhrase;
    private Object RequestMessage;
    private boolean IsSuccessStatusCode;
    private List<DataBean> data;
    private List<?> Headers;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public VersionBean getVersion() {
        return Version;
    }

    public void setVersion(VersionBean Version) {
        this.Version = Version;
    }

    public Object getContent() {
        return Content;
    }

    public void setContent(Object Content) {
        this.Content = Content;
    }

    public int getStatusCode() {
        return StatusCode;
    }

    public void setStatusCode(int StatusCode) {
        this.StatusCode = StatusCode;
    }

    public String getReasonPhrase() {
        return ReasonPhrase;
    }

    public void setReasonPhrase(String ReasonPhrase) {
        this.ReasonPhrase = ReasonPhrase;
    }

    public Object getRequestMessage() {
        return RequestMessage;
    }

    public void setRequestMessage(Object RequestMessage) {
        this.RequestMessage = RequestMessage;
    }

    public boolean isIsSuccessStatusCode() {
        return IsSuccessStatusCode;
    }

    public void setIsSuccessStatusCode(boolean IsSuccessStatusCode) {
        this.IsSuccessStatusCode = IsSuccessStatusCode;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public List<?> getHeaders() {
        return Headers;
    }

    public void setHeaders(List<?> Headers) {
        this.Headers = Headers;
    }

    public static class VersionBean {
        /**
         * Major : 1
         * Minor : 1
         * Build : -1
         * Revision : -1
         * MajorRevision : -1
         * MinorRevision : -1
         */

        private int Major;
        private int Minor;
        private int Build;
        private int Revision;
        private int MajorRevision;
        private int MinorRevision;

        public int getMajor() {
            return Major;
        }

        public void setMajor(int Major) {
            this.Major = Major;
        }

        public int getMinor() {
            return Minor;
        }

        public void setMinor(int Minor) {
            this.Minor = Minor;
        }

        public int getBuild() {
            return Build;
        }

        public void setBuild(int Build) {
            this.Build = Build;
        }

        public int getRevision() {
            return Revision;
        }

        public void setRevision(int Revision) {
            this.Revision = Revision;
        }

        public int getMajorRevision() {
            return MajorRevision;
        }

        public void setMajorRevision(int MajorRevision) {
            this.MajorRevision = MajorRevision;
        }

        public int getMinorRevision() {
            return MinorRevision;
        }

        public void setMinorRevision(int MinorRevision) {
            this.MinorRevision = MinorRevision;
        }
    }

    public static class DataBean {
        /**
         * Type : A
         * AppSeckill : {"Id":475,"StarTime":"2020-05-11 10:00:00","CurrTime":"2020-05-13 15:42:22","EndTime":"2020-05-14 09:59:59","state":0,"Remarks":"","AppSeckillProList":[{"Id":1839,"Pro_ProductId":7473,"Price":99,"ProductName":"52度 鸭溪窖 珍品酒 460ml（贵州老八大名酒）","imgUrl":"2019/0722/bd938fb9d10349009f70e6ca497dcd70.jpg","Num":50,"LimitNum":50,"OdrPrice":109,"IsRemind":0,"RemindID":0,"state":0,"Content":"窖香浓郁 绵柔净爽","StarTime":"2020-05-11 10:00:00","EndTime":"2020-05-14 09:59:59","CurrTime":"2020-05-13 15:42:23"},{"Id":1840,"Pro_ProductId":453,"Price":298,"ProductName":"52度 四特 东方韵 雅韵 500ml","imgUrl":"2018/0403/226b75b3bde24effa7cd54b2c553ccb0.jpg","Num":50,"LimitNum":50,"OdrPrice":308,"IsRemind":0,"RemindID":0,"state":0,"Content":"清香醇纯 回味无穷","StarTime":"2020-05-11 10:00:00","EndTime":"2020-05-14 09:59:59","CurrTime":"2020-05-13 15:42:23"},{"Id":1841,"Pro_ProductId":5924,"Price":99,"ProductName":"中国 张裕 窖藏 圆桶装 优选级 解百纳红葡萄酒 750ml","imgUrl":"2015/0203/f57b9d64f9374647a8ebb0ccad885d4f.jpg","Num":50,"LimitNum":50,"OdrPrice":109,"IsRemind":0,"RemindID":0,"state":0,"Content":"品质佳酿","StarTime":"2020-05-11 10:00:00","EndTime":"2020-05-14 09:59:59","CurrTime":"2020-05-13 15:42:23"},{"Id":1842,"Pro_ProductId":7857,"Price":128,"ProductName":"意大利 查理玛尔维萨甜白高泡葡萄酒 750ml","imgUrl":"2019/0112/67c696e9be2747208f282bc15dc00c4f.jpg","Num":50,"LimitNum":50,"OdrPrice":168,"IsRemind":0,"RemindID":0,"state":0,"Content":"品质佳酿","StarTime":"2020-05-11 10:00:00","EndTime":"2020-05-14 09:59:59","CurrTime":"2020-05-13 15:42:23"}]}
         */

        private String Type;
        private AppSeckillBean AppSeckill;

        public String getType() {
            return Type;
        }

        public void setType(String Type) {
            this.Type = Type;
        }

        public AppSeckillBean getAppSeckill() {
            return AppSeckill;
        }

        public void setAppSeckill(AppSeckillBean AppSeckill) {
            this.AppSeckill = AppSeckill;
        }

        public static class AppSeckillBean {
            /**
             * Id : 475
             * StarTime : 2020-05-11 10:00:00
             * CurrTime : 2020-05-13 15:42:22
             * EndTime : 2020-05-14 09:59:59
             * state : 0
             * Remarks :
             * AppSeckillProList : [{"Id":1839,"Pro_ProductId":7473,"Price":99,"ProductName":"52度 鸭溪窖 珍品酒 460ml（贵州老八大名酒）","imgUrl":"2019/0722/bd938fb9d10349009f70e6ca497dcd70.jpg","Num":50,"LimitNum":50,"OdrPrice":109,"IsRemind":0,"RemindID":0,"state":0,"Content":"窖香浓郁 绵柔净爽","StarTime":"2020-05-11 10:00:00","EndTime":"2020-05-14 09:59:59","CurrTime":"2020-05-13 15:42:23"},{"Id":1840,"Pro_ProductId":453,"Price":298,"ProductName":"52度 四特 东方韵 雅韵 500ml","imgUrl":"2018/0403/226b75b3bde24effa7cd54b2c553ccb0.jpg","Num":50,"LimitNum":50,"OdrPrice":308,"IsRemind":0,"RemindID":0,"state":0,"Content":"清香醇纯 回味无穷","StarTime":"2020-05-11 10:00:00","EndTime":"2020-05-14 09:59:59","CurrTime":"2020-05-13 15:42:23"},{"Id":1841,"Pro_ProductId":5924,"Price":99,"ProductName":"中国 张裕 窖藏 圆桶装 优选级 解百纳红葡萄酒 750ml","imgUrl":"2015/0203/f57b9d64f9374647a8ebb0ccad885d4f.jpg","Num":50,"LimitNum":50,"OdrPrice":109,"IsRemind":0,"RemindID":0,"state":0,"Content":"品质佳酿","StarTime":"2020-05-11 10:00:00","EndTime":"2020-05-14 09:59:59","CurrTime":"2020-05-13 15:42:23"},{"Id":1842,"Pro_ProductId":7857,"Price":128,"ProductName":"意大利 查理玛尔维萨甜白高泡葡萄酒 750ml","imgUrl":"2019/0112/67c696e9be2747208f282bc15dc00c4f.jpg","Num":50,"LimitNum":50,"OdrPrice":168,"IsRemind":0,"RemindID":0,"state":0,"Content":"品质佳酿","StarTime":"2020-05-11 10:00:00","EndTime":"2020-05-14 09:59:59","CurrTime":"2020-05-13 15:42:23"}]
             */

            private int Id;
            private String StarTime;
            private String CurrTime;
            private String EndTime;
            private int state;
            private String Remarks;
            private List<AppSeckillProListBean> AppSeckillProList;

            public int getId() {
                return Id;
            }

            public void setId(int Id) {
                this.Id = Id;
            }

            public String getStarTime() {
                return StarTime;
            }

            public void setStarTime(String StarTime) {
                this.StarTime = StarTime;
            }

            public String getCurrTime() {
                return CurrTime;
            }

            public void setCurrTime(String CurrTime) {
                this.CurrTime = CurrTime;
            }

            public String getEndTime() {
                return EndTime;
            }

            public void setEndTime(String EndTime) {
                this.EndTime = EndTime;
            }

            public int getState() {
                return state;
            }

            public void setState(int state) {
                this.state = state;
            }

            public String getRemarks() {
                return Remarks;
            }

            public void setRemarks(String Remarks) {
                this.Remarks = Remarks;
            }

            public List<AppSeckillProListBean> getAppSeckillProList() {
                return AppSeckillProList;
            }

            public void setAppSeckillProList(List<AppSeckillProListBean> AppSeckillProList) {
                this.AppSeckillProList = AppSeckillProList;
            }

            public static class AppSeckillProListBean {
                /**
                 * Id : 1839
                 * Pro_ProductId : 7473
                 * Price : 99
                 * ProductName : 52度 鸭溪窖 珍品酒 460ml（贵州老八大名酒）
                 * imgUrl : 2019/0722/bd938fb9d10349009f70e6ca497dcd70.jpg
                 * Num : 50
                 * LimitNum : 50
                 * OdrPrice : 109
                 * IsRemind : 0
                 * RemindID : 0
                 * state : 0
                 * Content : 窖香浓郁 绵柔净爽
                 * StarTime : 2020-05-11 10:00:00
                 * EndTime : 2020-05-14 09:59:59
                 * CurrTime : 2020-05-13 15:42:23
                 */

                private int Id;
                private int Pro_ProductId;
                private int Price;
                private String ProductName;
                private String imgUrl;
                private int Num;
                private int LimitNum;
                private int OdrPrice;
                private int IsRemind;
                private int RemindID;
                private int state;
                private String Content;
                private String StarTime;
                private String EndTime;
                private String CurrTime;

                public int getId() {
                    return Id;
                }

                public void setId(int Id) {
                    this.Id = Id;
                }

                public int getPro_ProductId() {
                    return Pro_ProductId;
                }

                public void setPro_ProductId(int Pro_ProductId) {
                    this.Pro_ProductId = Pro_ProductId;
                }

                public int getPrice() {
                    return Price;
                }

                public void setPrice(int Price) {
                    this.Price = Price;
                }

                public String getProductName() {
                    return ProductName;
                }

                public void setProductName(String ProductName) {
                    this.ProductName = ProductName;
                }

                public String getImgUrl() {
                    return imgUrl;
                }

                public void setImgUrl(String imgUrl) {
                    this.imgUrl = imgUrl;
                }

                public int getNum() {
                    return Num;
                }

                public void setNum(int Num) {
                    this.Num = Num;
                }

                public int getLimitNum() {
                    return LimitNum;
                }

                public void setLimitNum(int LimitNum) {
                    this.LimitNum = LimitNum;
                }

                public int getOdrPrice() {
                    return OdrPrice;
                }

                public void setOdrPrice(int OdrPrice) {
                    this.OdrPrice = OdrPrice;
                }

                public int getIsRemind() {
                    return IsRemind;
                }

                public void setIsRemind(int IsRemind) {
                    this.IsRemind = IsRemind;
                }

                public int getRemindID() {
                    return RemindID;
                }

                public void setRemindID(int RemindID) {
                    this.RemindID = RemindID;
                }

                public int getState() {
                    return state;
                }

                public void setState(int state) {
                    this.state = state;
                }

                public String getContent() {
                    return Content;
                }

                public void setContent(String Content) {
                    this.Content = Content;
                }

                public String getStarTime() {
                    return StarTime;
                }

                public void setStarTime(String StarTime) {
                    this.StarTime = StarTime;
                }

                public String getEndTime() {
                    return EndTime;
                }

                public void setEndTime(String EndTime) {
                    this.EndTime = EndTime;
                }

                public String getCurrTime() {
                    return CurrTime;
                }

                public void setCurrTime(String CurrTime) {
                    this.CurrTime = CurrTime;
                }
            }
        }
    }
}

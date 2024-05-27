package com.santhosh.patterns.builder;

public class HttpClient {
    
    @Override
    public String toString() {
        return "HttpClient [method=" + method + ", url=" + url + ", userName=" + userName + ", password=" + password
                + ", headers=" + headers + ", body=" + body + "]";
    }

    private String method;
    private String url;
    private String userName;
    private String password;
    private String headers;
    private String body;

    public HttpClient(HttpClientBuidler httpClientBuidler) {
        this.method = httpClientBuidler.method;
        this.url = httpClientBuidler.url;
        this.userName = httpClientBuidler.userName;
        this.password = httpClientBuidler.password;
        this.headers = httpClientBuidler.headers;
        this.body = httpClientBuidler.body;
    }

    public static class HttpClientBuidler{
        private String method;
        private String url;
        private String userName;
        private String password;
        private String headers;
        private String body;

        public HttpClientBuidler method(String method){
            this.method = method;
            return this;
        }

        public HttpClientBuidler url(String url){
            this.url = url;
            return this;
        }

        public HttpClientBuidler secure(String userName, String password){
            this.userName = userName;
            this.password = password;
            return this;
        }

        public HttpClientBuidler headers(String headers){
            this.headers = headers;
            return this;
        }

        public HttpClientBuidler body(String body){
            this.body = body;
            return this;
        }

        public HttpClient build(){
            return new HttpClient(this);
        }
    }
}

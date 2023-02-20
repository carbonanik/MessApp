package com.massage.massenger.data.remote.api_service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\f\r\u000e\u000f\u0010B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0006\u0082\u0001\u0005\u0011\u0012\u0013\u0014\u0015\u00a8\u0006\u0016"}, d2 = {"Lcom/massage/massenger/data/remote/api_service/HttpRoutes;", "", "()V", "BASE_URL", "", "getBASE_URL", "()Ljava/lang/String;", "LOCAL", "REMOTE", "SERVER", "SOCKET_HOST", "getSOCKET_HOST", "Auth", "File", "Group", "Post", "User", "Lcom/massage/massenger/data/remote/api_service/HttpRoutes$Auth;", "Lcom/massage/massenger/data/remote/api_service/HttpRoutes$User;", "Lcom/massage/massenger/data/remote/api_service/HttpRoutes$Group;", "Lcom/massage/massenger/data/remote/api_service/HttpRoutes$Post;", "Lcom/massage/massenger/data/remote/api_service/HttpRoutes$File;", "app_debug"})
public abstract class HttpRoutes {
    private final java.lang.String LOCAL = "10.0.2.2:8080";
    private final java.lang.String REMOTE = "ktor-mess-app.herokuapp.com";
    private final java.lang.String SERVER = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String BASE_URL = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String SOCKET_HOST = null;
    
    private HttpRoutes() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBASE_URL() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSOCKET_HOST() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006\u00a8\u0006\u000b"}, d2 = {"Lcom/massage/massenger/data/remote/api_service/HttpRoutes$Auth;", "Lcom/massage/massenger/data/remote/api_service/HttpRoutes;", "()V", "LOGIN", "", "getLOGIN", "()Ljava/lang/String;", "REFRESH", "getREFRESH", "SIGNUP", "getSIGNUP", "app_debug"})
    public static final class Auth extends com.massage.massenger.data.remote.api_service.HttpRoutes {
        @org.jetbrains.annotations.NotNull()
        public static final com.massage.massenger.data.remote.api_service.HttpRoutes.Auth INSTANCE = null;
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String LOGIN = null;
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String SIGNUP = null;
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String REFRESH = null;
        
        private Auth() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getLOGIN() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getSIGNUP() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getREFRESH() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0011\u0010\r\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u0011\u0010\u000f\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/massage/massenger/data/remote/api_service/HttpRoutes$User;", "Lcom/massage/massenger/data/remote/api_service/HttpRoutes;", "()V", "DELETE", "", "getDELETE", "()Ljava/lang/String;", "GET_ALL", "getGET_ALL", "GET_BY_ID", "getGET_BY_ID", "GET_BY_NAME", "getGET_BY_NAME", "GET_BY_PHONE", "getGET_BY_PHONE", "ME", "getME", "app_debug"})
    public static final class User extends com.massage.massenger.data.remote.api_service.HttpRoutes {
        @org.jetbrains.annotations.NotNull()
        public static final com.massage.massenger.data.remote.api_service.HttpRoutes.User INSTANCE = null;
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String ME = null;
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String GET_ALL = null;
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String GET_BY_NAME = null;
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String GET_BY_ID = null;
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String GET_BY_PHONE = null;
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String DELETE = null;
        
        private User() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getME() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getGET_ALL() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getGET_BY_NAME() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getGET_BY_ID() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getGET_BY_PHONE() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDELETE() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0011\u0010\r\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006\u00a8\u0006\u000f"}, d2 = {"Lcom/massage/massenger/data/remote/api_service/HttpRoutes$Group;", "Lcom/massage/massenger/data/remote/api_service/HttpRoutes;", "()V", "ADD_MEMBER", "", "getADD_MEMBER", "()Ljava/lang/String;", "ALL_FOR_USER", "getALL_FOR_USER", "CREATE", "getCREATE", "GET_BY_ID", "getGET_BY_ID", "REMOVE_MEMBER", "getREMOVE_MEMBER", "app_debug"})
    public static final class Group extends com.massage.massenger.data.remote.api_service.HttpRoutes {
        @org.jetbrains.annotations.NotNull()
        public static final com.massage.massenger.data.remote.api_service.HttpRoutes.Group INSTANCE = null;
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String CREATE = null;
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String GET_BY_ID = null;
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String ADD_MEMBER = null;
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String REMOVE_MEMBER = null;
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String ALL_FOR_USER = null;
        
        private Group() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCREATE() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getGET_BY_ID() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getADD_MEMBER() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getREMOVE_MEMBER() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getALL_FOR_USER() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0011\u0010\r\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u0011\u0010\u000f\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006R\u0011\u0010\u0011\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0006\u00a8\u0006\u0013"}, d2 = {"Lcom/massage/massenger/data/remote/api_service/HttpRoutes$Post;", "Lcom/massage/massenger/data/remote/api_service/HttpRoutes;", "()V", "CREATE", "", "getCREATE", "()Ljava/lang/String;", "DELETE", "getDELETE", "GET_ALL_BETWEEN", "getGET_ALL_BETWEEN", "GET_ALL_PAGED", "getGET_ALL_PAGED", "GET_ALL_UNTIL", "getGET_ALL_UNTIL", "GET_BY_ID", "getGET_BY_ID", "GET_OF_USER", "getGET_OF_USER", "app_debug"})
    public static final class Post extends com.massage.massenger.data.remote.api_service.HttpRoutes {
        @org.jetbrains.annotations.NotNull()
        public static final com.massage.massenger.data.remote.api_service.HttpRoutes.Post INSTANCE = null;
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String CREATE = null;
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String GET_BY_ID = null;
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String GET_OF_USER = null;
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String GET_ALL_PAGED = null;
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String GET_ALL_UNTIL = null;
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String GET_ALL_BETWEEN = null;
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String DELETE = null;
        
        private Post() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCREATE() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getGET_BY_ID() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getGET_OF_USER() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getGET_ALL_PAGED() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getGET_ALL_UNTIL() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getGET_ALL_BETWEEN() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDELETE() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/massage/massenger/data/remote/api_service/HttpRoutes$File;", "Lcom/massage/massenger/data/remote/api_service/HttpRoutes;", "()V", "UPLOAD_PHOTO", "", "getUPLOAD_PHOTO", "()Ljava/lang/String;", "app_debug"})
    public static final class File extends com.massage.massenger.data.remote.api_service.HttpRoutes {
        @org.jetbrains.annotations.NotNull()
        public static final com.massage.massenger.data.remote.api_service.HttpRoutes.File INSTANCE = null;
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String UPLOAD_PHOTO = null;
        
        private File() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getUPLOAD_PHOTO() {
            return null;
        }
    }
}
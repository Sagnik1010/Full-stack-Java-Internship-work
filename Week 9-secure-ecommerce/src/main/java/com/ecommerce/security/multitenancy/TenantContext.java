package com.ecommerce.security.multitenancy;

public class TenantContext {
    private static final ThreadLocal<String> CURRENT = new ThreadLocal<>();
    public static void setTenant(String tenant){ CURRENT.set(tenant); }
    public static String getTenant(){ return CURRENT.get(); }
}

package com.ecommerce.security.jwt;

import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class TokenBlacklistService {
    private final Set<String> blacklist = new HashSet<>();
    public void blacklist(String token){ blacklist.add(token); }
    public boolean isBlacklisted(String token){ return blacklist.contains(token); }
}


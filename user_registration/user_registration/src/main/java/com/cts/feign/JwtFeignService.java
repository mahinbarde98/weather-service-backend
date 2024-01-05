//package com.cts.user_registration.feign;
//
//import com.cts.user_registration.entity.JwtRequest;
//import com.cts.user_registration.entity.JwtResponse;
//import com.cts.user_registration.entity.UserCredentials;
//import org.springframework.cloud.openfeign.FeignClient;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//
//@FeignClient(value = "USER-AUTHENTICATION")
//public interface JwtFeignService {
//    @PostMapping("authservice/auth")
//    public JwtResponse logIn(@RequestBody JwtRequest jwtRequest);
//
//    @PostMapping("authservice/register")
//    public void registerUserdetails (@RequestBody UserCredentials userCredentials);
//
//}

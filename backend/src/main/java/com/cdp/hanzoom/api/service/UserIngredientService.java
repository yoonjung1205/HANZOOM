package com.cdp.hanzoom.api.service;

import com.cdp.hanzoom.api.request.UserIngredientRegisterReq;
import com.cdp.hanzoom.api.request.UserIngredientStatusUpdateReq;
import com.cdp.hanzoom.api.request.UserIngredientTypeUpdateReq;
import com.cdp.hanzoom.api.response.UserIngredientFindRes;
import com.cdp.hanzoom.db.entity.UserIngredient;

import java.util.List;

/**
 *	유저 식재료 관련 비즈니스 로직 처리를 위한 서비스 인터페이스 정의.
 */
public interface UserIngredientService {
    /** 유저 식재료 정보를 생성하는 registerUserIngredient 입니다. **/
    void registerUserIngredient(UserIngredientRegisterReq userIngredientRegisterReq, String userEmail);
    /** 유저 식재료 정보를 전체 조회하는 findAllUserIngredient 입니다. **/
    List<UserIngredientFindRes> findAllUserIngredient(String userEmail);
    /** userIngredientNo을 이용하여 유저 식재료 정보(식재료 명 포함)를 조회하는 findUserIngredientByIngredientName 입니다. **/
    UserIngredientFindRes findByUserIngredientNo(Long userIngredientNo);
    /** IngredientNo과 userEmail을 이용하여 유저 식재료 정보를 조회하는 findUserIngredientByIngredientName 입니다. **/
    UserIngredient findUserIngredientByUserIngredientNoAndUserEmail(Long IngredientNo, String userEmail);
    /** 유저 식재료 정보를 수정하는 updateUserIngredient 입니다. **/
    void updateUserIngredient(UserIngredientTypeUpdateReq userIngredientTypeUpdateReq);
    /** 유저 식재료 등록상태(status) 정보를 수정하는 updateUserIngredientStatus 입니다. **/
    void updateUserIngredientStatus(UserIngredientStatusUpdateReq userIngredientStatusUpdateReq);
    /** 유저 식재료 정보를 삭제하는 deleteUserIngredient 입니다. **/
    void deleteUserIngredient(UserIngredient userIngredient);
    /** 식재료 등록 요청한 정보들을 전체 조회하는 findAllPendingUserIngredient 입니다. **/
    List<UserIngredientFindRes> findAllPendingUserIngredient();
}

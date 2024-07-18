Feature:  API TESTS
    @newuserregistration2 @sendotp
    Scenario: Verify successful send otp
        Given I access the endpoint "auth/v1/send-otp" "sendotp"
        And headers are "accept, */*:Content-Type, application/json" "sendotp"
        When I send the request "mobile,12123453455" "sendotp"
        Then I should be able to get status code of 200 "sendotp"
        And my body should have the right response body

    @newuserregistration2 @validateotp
    Scenario: Verify  checkout requests endpoint is working
        Given I access the endpoint "auth/v1/validate-otp" "validateotp"
        And headers are "accept,application/json:deviceModel,Iphone X:operatingSystem,Android:appVersion,1.0.0.1:imei,APPKEY17-17A3-4BAF-AA0F-B1258C5017A6:wl,WP" "validateotp"
        When I send the request "mobile,12123453455:otp,11111:referralId,null" "validateotp"
        Then I should be able to get status code of 200 "validateotp" on validateotp
        And my validateotp body should have the right response body

    @newuserregistration2 @authorize
    Scenario: Verify  checkout requests endpoint is working
        Given I access the endpoint "auth/v1/authorize" "authorize"
        And headers are "accept,*/*:Cookie,PHPSESSID=0s0veu67ekjvj5uplpvoa0q5li" "authorize"
        And parameters are "client_id,e4dcd77207924b0de01ab3df934e05fe:response_type,code:scope,CUSTOMER:code_challenge,uZNVNwW_EqAYJrDaycGB0pRt-I7XHgTY42cONv_VL2E:code_challenge_method,S256:state,blank" "authorize"
        Then I should be able to get status code of 200 "authorize" on authorize
        And my body should have the right response body

# client_id=e4dcd77207924b0de01ab3df934e05fe&response_type=code&scope=CUSTOMER&code_challenge=uZNVNwW_EqAYJrDaycGB0pRt-I7XHgTY42cONv_VL2E&code_challenge_method=S256&state
    @newuserregistration2 @getfaq
    Scenario: Verify  checkout requests endpoint is working
        Given I access the endpoint "m-wallet/v1/get-faq" "getfaq"
        Then I should be able to get status code of 200 "getfaq" on getfaq
        And headers are "accept,application/json:deviceModel,Iphone X:operatingSystem,Android:appVersion,1.0.0.1:imei,APPKEY17-17A3-4BAF-AA0F-B1258C5017A6:wl,WP" "getfaq"
        When I send the request ":" "getfaq"
        And my body should have the right response body



# java-microservice
# This is a simple java spring boot microservice with annotations added to run as a Eureka client

# Access the swagger documentation by using below url
# http://localhost:8080/infra/swagger-ui.html

# Implementation 1- Using with service discovery

# Bring up service discovery(8761) and java microservice client (8080)
# Generate a access token by sending a post request to the service discovery authentication # gateway
# http://localhost:8761/oauth/token
# once access token is generated use the access token as reqeuest parameter to hit the actual service url
# http://localhost:8761/api/service1/infra/api/demo?access_token=<accessToken>

# Implementation 1- Using with okta service discovery

# create a okta developer id and configure the okta configurations in application.properties
# generate the access token using okta as below
# https://dev-538031.okta.com/oauth2/default/v1/token
# once access token is generated use the access token to hit the actual service url
# send Authorization Bearer token as access token
# localhost:8080/infra/api/demo
# Generic Interceptor pre handle should be commented out for this testing





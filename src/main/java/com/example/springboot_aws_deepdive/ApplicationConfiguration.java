//package com.example.springboot_aws_deepdive;
//
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class ApplicationConfiguration {
//
//    public void getSecret(){
//        // Use this code snippet in your app.
//// If you need more information about configurations or implementing the sample
//// code, visit the AWS docs:
//// https://docs.aws.amazon.com/sdk-for-java/latest/developer-guide/home.html
//
//// Make sure to import the following packages in your code
//// import software.amazon.awssdk.regions.Region;
//// import software.amazon.awssdk.services.secretsmanager.SecretsManagerClient;
//// import software.amazon.awssdk.services.secretsmanager.model.GetSecretValueRequest;
//// import software.amazon.awssdk.services.secretsmanager.model.GetSecretValueResponse;
//
//        public static void getSecret() {
//
//            String secretName = "RDS_Secretkeys";
//            Region region = Region.of("us-east-1");
//
//            // Create a Secrets Manager client
//            SecretsManagerClient client = SecretsManagerClient.builder()
//                    .region(region)
//                    .build();
//
//            GetSecretValueRequest getSecretValueRequest = GetSecretValueRequest.builder()
//                    .secretId(secretName)
//                    .build();
//
//            GetSecretValueResponse getSecretValueResponse;
//
//            try {
//                getSecretValueResponse = client.getSecretValue(getSecretValueRequest);
//            } catch (Exception e) {
//                // For a list of exceptions thrown, see
//                // https://docs.aws.amazon.com/secretsmanager/latest/apireference/API_GetSecretValue.html
//                throw e;
//            }
//
//            String secret = getSecretValueResponse.secretString();
//
//            // Your code goes here.
//        }
//    }
//}

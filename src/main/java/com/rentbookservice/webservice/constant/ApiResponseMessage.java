package com.rentbookservice.webservice.constant;

public class ApiResponseMessage {
    // 2XX
    public static final String CREATED_SUCCESSFULLY = "Created sucessfully.";
    public static final String FETCHED_SUCCESSFULLY = "Fetched sucessfully.";
    public static final String UPDATED_SUCCESSFULLY = "Updated successfully.";
    public static final String DELETED_SUCCESSFULLY = "Deleted successfully.";

    // 4XX
    public static final String ALREADY_EXIST = "Already exist.";
    public static final String EMAIL_ALREADY_EXIST = "Email already exist.";
    public static final String PHONE_NUMBER_ALREADY_EXIST = "Phone number already exist.";
    public static final String NOT_FOUND = "Not found.";
    public static final String INVALID_REQUEST = "Invalid request.";
    public static final String REQUIRED_FIELDS_ARE_MISSING = "Required fields are missing.";

    // User specific
    public static final String USER_NOT_FOUND = "User not found.";

}

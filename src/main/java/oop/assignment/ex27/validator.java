package oop.assignment.ex27;

public class validator {
    public static int validateInput(String first_name, String last_name, String zip_code, String employee_id) {
        int first_name_result = first_name_validator(first_name);
        int last_name_result = last_name_validator(last_name);
        int zip_code_result = zip_code_result_validator(zip_code);
        int employee_id_result = employee_id_validator(employee_id);


        if(first_name_result == 0 && last_name_result == 0 && zip_code_result == 0 && employee_id_result == 0)
            return 0;
    }

    public static int first_name_validator(String first_name) {


    }

    public static int last_name_validator(String last_name){

    }

    public static int zip_code_result_validator(String zip_code){

    }

    public static int employee_id_validator(String employee_id){

    }

    public static {

    }
}

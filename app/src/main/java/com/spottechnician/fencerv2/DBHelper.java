package com.spottechnician.fencerv2;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by Milind on 15-03-2017.
 */

public class DBHelper extends SQLiteOpenHelper {


    private static final String DB_NAME = "CAudit";
    //Bank Table 1

    public static final String TABLE_BANK="bank";
    public static final String COLUMN_BANK_ID="id_bank";
    public static final String COLUMN_BANK_NAME="name";

    //Lobby Table 2

    public static final String TABLE_LOBBY="lobby";
    public static final String COLUMN_LOBBY_ID="id_lobby";
    public static final String COLUMN_LOBBY_BANK_ID="id_bank";
    public static final String COLUMN_LOBBY_CUSTOMER_ID="id_customer";
    public static final String COLUMN_LOBBY_LOCATION="location";
    public static final String COLUMN_LOBBY_CITY="city";
    public static final String COLUMN_LOBBY_NEED_CSR="need_csr";
    public static final String COLUMN_LOBBY_STATUS_ID="id_status";
    public static final String COLUMN_LOBBY_CAPTURE_DATE="capture_date";
    public static final String COLUMN_LOBBY_LAT="lat";
    public static final String COLUMN_LOBBY_LONG="long";

    //Supervisor Table 3

    public static final String TABLE_SUPERVISOR="supervisor";
    public static final String COLUMN_SUPERVISOR_ID="id_supervisor";
    public static final String COLUMN_SUPERVISOR_NAME="name";
    public static final String COLUMN_SUPERVISOR_LOGIN_ID="login_id";
    public static final String COLUMN_SUPERVISOR_MOBILE="mobile";

    //4 Lobby_Supervisor_Mapping

    public static final String TABLE_LOBBY_SUPERVISOR_MAPPING="lobby_supervisor_mapping";
    public static final String COLUMN_LOBBY_SUPERVISOR_MAPPING_ID="id_lobby_supervisor_mapping";
    public static final String COLUMN_LOBBY_SUPERVISOR_MAPPING_LOBBY_ID="lobby_id";
    public static final String COLUMN_LOBBY_SUPERVISOR_MAPPING_SUP_ID="sup_id";


    //5 Aadhar

    public static final String TABLE_AADHAR="aadhar";
    public static final String COLUMN_AADHAR_ID="id_aadhar";
    public static final String COLUMN_AADHAR_NO="aadhar_no";
    public static final String COLUMN_AADHAR_FNAME="fname";
    public static final String COLUMN_AADHAR_LNAME="lname";
    public static final String COLUMN_AADHAR_MOBILE_NO="mobile_no";
    public static final String COLUMN_AADHAR_ADDRESS="address";
    public static final String COLUMN_AADHAR_FATHER_NAME="father_name";
    public static final String COLUMN_AADHAR_DOB="dob";
    public static final String COLUMN_AADHAR_PINCODE="pincode";
    public static final String COLUMN_AADHAR_PERSON_PHOTO_PATH="person_photo";
    public static final String COLUMN_AADHAR_PANCARD_PHOTO_PATH="pancard_photo";
    public static final String COLUMN_AADHAR_BANK_AC_INFO_SNAP_PATH="bank_ac_info_snap";


    //6 Caretaker

    public static final String TABLE_CARETAKER="caretaker";
    public static final String COLUMN_CARETAKER_ID="id_caretaker";
    public static final String COLUMN_CARETAKER_AADHAR_ID="id_aadhar";
    public static final String COLUMN_CARETAKER_LOBBY_ID="lobby_id";
    public static final String COLUMN_CARETAKER_JOINING_DATE="joining_date";
    public static final String COLUMN_CARETAKER_LEAVING_DATE="leaving_date";
    public static final String COLUMN_CARETAKER_PHOTO_OF_CT_PATH="photo_of_ct";
    public static final String COLUMN_CARETAKER_MOBILE_NO="mobile_no";

//7 Customer

    public static final String TABLE_CUSTOMER="customer";
    public static final String COLUMN_CUSTOMER_ID="id_customer";
    public static final String COLUMN_CUSTOMER_NAME="name";

//8 Status

    public static final String TABLE_STATUS="Status";
    public static final String COLUMN_STATUS_ID="id_status";
    public static final String COLUMN_STATUS_STATUS="status";

//9 ATM

    public static final String TABLE_ATM="atm";
    public static final String COLUMN_ATM_ID="id_atm";
    public static final String COLUMN_ACTUAL_ATM_ID="atm_id";
    public static final String COLUMN_ATM_LOBBY_ID="lobby_id";

    //10 Takeover
    public static final String TABLE_TAKEOVER="takeover";
    public static final String COLUMN_TAKEOVER_ID="id_takeover";
    public static final String COLUMN_TAKEOVER_LOBBY_ID="lobby_id";
    public static final String COLUMN_TAKEOVER_HANDOVER_AGENCY="handover_agency";
    public static final String COLUMN_TAKEOVER_FORM_PHOTO_1="form_photo_1";
    public static final String COLUMN_TAKEOVER_FORM_PHOTO_2="form_photo_2";
    public static final String COLUMN_TAKEOVER_FORM_PHOTO_3="form_photo_3";
    public static final String COLUMN_TAKEOVER_SIGNAGE_IMG="signage_img";
    public static final String COLUMN_TAKEOVER_ATM_PHOTO_1="atm_photo_1";
    public static final String COLUMN_TAKEOVER_ATM_PHOTO_2="atm_photo_2";
    public static final String COLUMN_TAKEOVER_REMARKS="remarks";
    public static final String COLUMN_TAKEOVER_CUSTOMER_PERSON_NAME="cust_person_name";
    public static final String COLUMN_TAKEOVER_CUSTOMER_PERSON_NO="cust_person_no";
    public static final String COLUMN_TAKEOVER_DATE="takeover_date";

    //11 CSR

    public static final String TABLE_CSR="csr";
    public static final String COLUMN_CSR_ID="id_csr";
    public static final String COLUMN_CSR_LOBBY_ID="lobby_id";
    public static final String COLUMN_CSR_SNAP1="csr_snap1";
    public static final String COLUMN_CSR_SNAP2="csr_snap2";
    public static final String COLUMN_CSR_SNAP3="csr_snap3";
    public static final String COLUMN_CSR_YEAR_IN_FORM="csr_year_in_form";
    public static final String COLUMN_CSR_MONTH_IN_FORM="csr_month_in_form";

    //12 RP_PAPERTYPE

    public static final String TABLE_RP_PAPERTYPE="RP_papertype";
    public static final String COLUMN_RP_PAPERTYPE_ID="id_RP_papertype";
    public static final String COLUMN_RP_PAPERTYPE_TYPE="type";

    //13 JP_PAPERTYPE

    public static final String TABLE_JP_PAPERTYPE="JP_papertype";
    public static final String COLUMN_JP_PAPERTYPE_ID="id_JP_papertype";
    public static final String COLUMN_JP_PAPERTYPE_TYPE="type";

    //14 RP_RIBBONTYPE

    public static final String TABLE_RP_RIBBONTYPE="RP_ribbontype";
    public static final String COLUMN_RP_RIBBONTYPE_ID="id_RP_ribbontype";
    public static final String COLUMN_RP_RIBBONTYPE_TYPE="type";

    //15 RP_RIBBONTYPE

    public static final String TABLE_JP_RIBBONTYPE="JP_ribbontype";
    public static final String COLUMN_JP_RIBBONTYPE_ID="id_JP_ribbontype";
    public static final String COLUMN_JP_RIBBONTYPE_TYPE="type";


//16 RNM_takeover

    public static final String TABLE_RNM_TAKEOVER="RNM_takeover";
    public static final String COLUMN_RNM_TAKEOVER_ID="id_RNM_takeover";
    public static final String COLUMN_RNM_TAKEOVER_LOBBY_ID="lobby_id";
    public static final String COLUMN_RNM_TAKEOVER_SIGNAGE_PHOTO="signage_photo";
    public static final String COLUMN_RNM_TAKEOVER_RNM_PHOTO2="RNM_photo2";

//17 Ebill_takeover

    public static final String TABLE_EBILL_TAKEOVER="Ebill_takeover";
    public static final String COLUMN_EBILL_TAKEOVER_ID="id_Ebill_takeover";
    public static final String COLUMN_EBILL_TAKEOVER_LOBBY_ID="lobby_id";
    public static final String COLUMN_EBILL_TAKEOVER_CONSUMER_NO="consumer_no";
    public static final String COLUMN_EBILL_TAKEOVER_METER_NO="meter_no";
    public static final String COLUMN_EBILL_TAKEOVER_LANDLORD_NAME="landlord_name";
    public static final String COLUMN_EBILL_TAKEOVER_LANDLORD_NO="landlord_no";
    public static final String COLUMN_EBILL_TAKEOVER_DISTRIBUTOR="distributor";


    //18 Lobby_Service_Mapping

    public static final String TABLE_LOBBY_SERVICE_MAPPING="lobby_service_mapping";
    public static final String COLUMN_LOBBY_SERVICE_MAPPING_ID="id_lobby_service_mapping";
    public static final String COLUMN_LOBBY_SERVICE_MAPPING_LOBBY_ID="lobby_id";
    public static final String COLUMN_LOBBY_SERVICE_MAPPING_SERVICE="service";


    //19 Handover
    public static final String TABLE_HANDOVER="handover";
    public static final String COLUMN_HANDOVER_ID="id_handover";
    public static final String COLUMN_HANDOVER_TAKEOVER_AGENCY="takeover_agency";
    public static final String COLUMN_HANDOVER_HO_FORM_IMG_1="HO_form_img_1";
    public static final String COLUMN_HANDOVER_HO_FORM_IMG_2="HO_form_img_2";
    public static final String COLUMN_HANDOVER_HO_FORM_IMG_3="HO_form_img_3";
    public static final String COLUMN_HANDOVER_REMARKS="remarks";
    public static final String COLUMN_HANDOVER_EXPECTED_HANDOVER_DATE="expected_handover_date";
    public static final String COLUMN_HANDOVER_DATE="handover_date";

    //20 FLM_takeover

    public static final String TABLE_FLM_TAKEOVER="FLM_takeover";
    public static final String COLUMN_FLM_TAKEOVER_ID="id_FLM_takeover";
    public static final String COLUMN_FLM_TAKEOVER_ATM_ID="id_atm";
    public static final String COLUMN_FLM_TAKEOVER_JP_PAPERTYPE_ID="JP_papertype_id";
    public static final String COLUMN_FLM_TAKEOVER_RP_PAPERTYPE_ID="RP_papertype_id";
    public static final String COLUMN_FLM_TAKEOVER_JP_RIBBONTYPE_ID="JP_ribbontype_id";
    public static final String COLUMN_FLM_TAKEOVER_RP_RIBBONTYPE_ID="RP_ribbontype_id";
    private static final String TAG = "Logging";
    private static final int DB_VERSION = 1;

    ///////////////////////////////////Tables ///////////////////////////////////////////
    //1 Bank Table
    private static final String createBank = "CREATE TABLE " + TABLE_BANK +
            "(" + COLUMN_BANK_ID+ " INTEGER PRIMARY KEY AUTOINCREMENT ,"
            + COLUMN_BANK_NAME + " TEXT)";

    //2 Lobby Table
    private static final String createLobby= "CREATE TABLE " + TABLE_LOBBY+
            "(" + COLUMN_LOBBY_ID+ " INTEGER PRIMARY KEY AUTOINCREMENT ,"
            + COLUMN_LOBBY_BANK_ID + " TEXT ,"
            + COLUMN_LOBBY_CUSTOMER_ID+ " TEXT ,"
            + COLUMN_LOBBY_LOCATION+ " TEXT ,"
            + COLUMN_LOBBY_CITY+ " TEXT ,"
            + COLUMN_LOBBY_NEED_CSR+ " TEXT ,"
            + COLUMN_LOBBY_STATUS_ID+ " TEXT ,"
            + COLUMN_LOBBY_CAPTURE_DATE+ " TEXT ,"
            + COLUMN_LOBBY_LAT+ " TEXT ,"
            + COLUMN_LOBBY_LONG+ " TEXT)";

    //3 Supervisor
    private static final String createSupervisor = "CREATE TABLE " + TABLE_SUPERVISOR+
            "(" + COLUMN_SUPERVISOR_ID+ " INTEGER PRIMARY KEY AUTOINCREMENT ,"
            + COLUMN_SUPERVISOR_NAME+ " TEXT ,"
            + COLUMN_SUPERVISOR_LOGIN_ID+ " TEXT ,"
            + COLUMN_SUPERVISOR_MOBILE+ " TEXT)";

    //4 Lobby_Supervisor_Mapping
    private static final String createLobbySupervisorMapping = "CREATE TABLE " + TABLE_LOBBY_SUPERVISOR_MAPPING+
            "(" + COLUMN_LOBBY_SUPERVISOR_MAPPING_ID+ " INTEGER PRIMARY KEY AUTOINCREMENT ,"
            + COLUMN_LOBBY_SUPERVISOR_MAPPING_LOBBY_ID+ " TEXT ,"
            + COLUMN_LOBBY_SUPERVISOR_MAPPING_SUP_ID+ " TEXT)";

    //5 Aadhar
    private static final String createAadhar= "CREATE TABLE " + TABLE_AADHAR+
            "(" + COLUMN_AADHAR_ID+ " INTEGER PRIMARY KEY AUTOINCREMENT ,"
            + COLUMN_AADHAR_NO+ " TEXT ,"
            + COLUMN_AADHAR_FNAME+ " TEXT ,"
            + COLUMN_AADHAR_LNAME+ " TEXT ,"
            + COLUMN_AADHAR_MOBILE_NO+ " TEXT ,"
            + COLUMN_AADHAR_ADDRESS+ " TEXT ,"
            + COLUMN_AADHAR_FATHER_NAME+ " TEXT ,"
            + COLUMN_AADHAR_DOB+ " TEXT ,"
            + COLUMN_AADHAR_PINCODE+ " TEXT ,"
            + COLUMN_AADHAR_PERSON_PHOTO_PATH+ " TEXT ,"
            + COLUMN_AADHAR_PANCARD_PHOTO_PATH+ " TEXT ,"
            + COLUMN_AADHAR_BANK_AC_INFO_SNAP_PATH+ " TEXT)";

    //6 Caretaker
    private static final String createCaretaker= "CREATE TABLE " + TABLE_CARETAKER+
            "(" + COLUMN_CARETAKER_ID+ " INTEGER PRIMARY KEY AUTOINCREMENT ,"
            + COLUMN_CARETAKER_AADHAR_ID+ " TEXT ,"
            + COLUMN_CARETAKER_LOBBY_ID+ " TEXT ,"
            + COLUMN_CARETAKER_JOINING_DATE+ " DATETIME,"
            + COLUMN_CARETAKER_LEAVING_DATE+ " DATETIME,"
            + COLUMN_CARETAKER_PHOTO_OF_CT_PATH+ " TEXT ,"
            + COLUMN_CARETAKER_MOBILE_NO+ " TEXT)";

    //7 Customer
    private static final String createCustomer = "CREATE TABLE " + TABLE_CUSTOMER+
            "(" + COLUMN_CUSTOMER_ID+ " INTEGER PRIMARY KEY AUTOINCREMENT ,"
            + COLUMN_CUSTOMER_NAME+ " TEXT)";

    //8 Status
    private static final String createStatus = "CREATE TABLE " + TABLE_STATUS+
            "(" + COLUMN_STATUS_ID+ " INTEGER PRIMARY KEY AUTOINCREMENT ,"
            + COLUMN_STATUS_STATUS+ " TEXT)";

    //9 ATM
    private static final String createATM = "CREATE TABLE " + TABLE_ATM+
            "(" + COLUMN_ATM_ID+ " INTEGER PRIMARY KEY AUTOINCREMENT ,"
            + COLUMN_ACTUAL_ATM_ID+ " TEXT ,"
            + COLUMN_ATM_LOBBY_ID+ " TEXT)";


    //10 Takeover
    private static final String createTakeover= "CREATE TABLE " + TABLE_TAKEOVER+
            "(" + COLUMN_TAKEOVER_ID+ " INTEGER PRIMARY KEY AUTOINCREMENT ,"
            + COLUMN_TAKEOVER_LOBBY_ID+ " TEXT ,"
            + COLUMN_TAKEOVER_HANDOVER_AGENCY+ " TEXT ,"
            + COLUMN_TAKEOVER_FORM_PHOTO_1+ " TEXT,"
            + COLUMN_TAKEOVER_FORM_PHOTO_2+ " TEXT,"
            + COLUMN_TAKEOVER_FORM_PHOTO_3+ " TEXT ,"
            + COLUMN_TAKEOVER_SIGNAGE_IMG+ " TEXT ,"
            + COLUMN_TAKEOVER_ATM_PHOTO_1+ " TEXT ,"
            + COLUMN_TAKEOVER_ATM_PHOTO_2+ " TEXT ,"
            + COLUMN_TAKEOVER_REMARKS+ " TEXT ,"
            + COLUMN_TAKEOVER_CUSTOMER_PERSON_NAME+ " TEXT ,"
            + COLUMN_TAKEOVER_CUSTOMER_PERSON_NO+ " TEXT ,"
            + COLUMN_TAKEOVER_DATE+ " DATETIME)";

    //11 Handover
    private static final String createHandover= "CREATE TABLE " + TABLE_HANDOVER+
            "(" + COLUMN_HANDOVER_ID+ " INTEGER PRIMARY KEY AUTOINCREMENT ,"
            + COLUMN_HANDOVER_TAKEOVER_AGENCY+ " TEXT ,"
            + COLUMN_HANDOVER_HO_FORM_IMG_1+ " TEXT ,"
            + COLUMN_HANDOVER_HO_FORM_IMG_2+ " TEXT,"
            + COLUMN_HANDOVER_HO_FORM_IMG_3+ " TEXT,"
            + COLUMN_HANDOVER_REMARKS+ " TEXT ,"
            + COLUMN_HANDOVER_EXPECTED_HANDOVER_DATE+ " DATETIME ,"
            + COLUMN_HANDOVER_DATE+ " DATETIME)";

    //12 Lobby_service_mapping
    private static final String createLobbyServiceMapping= "CREATE TABLE " + TABLE_LOBBY_SERVICE_MAPPING+
            "(" + COLUMN_LOBBY_SERVICE_MAPPING_ID+ " INTEGER PRIMARY KEY AUTOINCREMENT ,"
            + COLUMN_LOBBY_SERVICE_MAPPING_LOBBY_ID+ " TEXT ,"
            + COLUMN_LOBBY_SERVICE_MAPPING_SERVICE+ " TEXT)";

    //13 CSR
    private static final String createCSR= "CREATE TABLE " + TABLE_CSR+
            "(" + COLUMN_CSR_ID+ " INTEGER PRIMARY KEY AUTOINCREMENT ,"
            + COLUMN_CSR_LOBBY_ID+ " TEXT ,"
            + COLUMN_CSR_SNAP1+ " TEXT ,"
            + COLUMN_CSR_SNAP2+ " TEXT,"
            + COLUMN_CSR_SNAP3+ " TEXT,"
            + COLUMN_CSR_YEAR_IN_FORM+ " TEXT ,"
            + COLUMN_CSR_MONTH_IN_FORM+ " DATETIME)";

    //14 RP_papertype
    private static final String createRP_papertype= "CREATE TABLE " + TABLE_RP_PAPERTYPE+
            "(" + COLUMN_RP_PAPERTYPE_ID+ " INTEGER PRIMARY KEY AUTOINCREMENT ,"
            + COLUMN_RP_PAPERTYPE_TYPE+ " TEXT)";

    //15 RP_ribbontype
    private static final String createRP_ribbontype= "CREATE TABLE " + TABLE_RP_RIBBONTYPE+
            "(" + COLUMN_RP_RIBBONTYPE_ID+ " INTEGER PRIMARY KEY AUTOINCREMENT ,"
            + COLUMN_RP_RIBBONTYPE_TYPE+ " TEXT)";

    //16 JP_papertype
    private static final String createJP_papertype= "CREATE TABLE " + TABLE_JP_PAPERTYPE+
            "(" + COLUMN_JP_PAPERTYPE_ID+ " INTEGER PRIMARY KEY AUTOINCREMENT ,"
            + COLUMN_JP_PAPERTYPE_TYPE+ " TEXT)";

    //17 JP_ribbontype
    private static final String createJP_ribbontype= "CREATE TABLE " + TABLE_JP_RIBBONTYPE+
            "(" + COLUMN_JP_RIBBONTYPE_ID+ " INTEGER PRIMARY KEY AUTOINCREMENT ,"
            + COLUMN_JP_RIBBONTYPE_TYPE+ " TEXT)";

    //18 CSR
    private static final String createFLM_takeover= "CREATE TABLE " + TABLE_FLM_TAKEOVER+
            "(" + COLUMN_FLM_TAKEOVER_ID+ " INTEGER PRIMARY KEY AUTOINCREMENT ,"
            + COLUMN_FLM_TAKEOVER_ATM_ID+ " TEXT ,"
            + COLUMN_FLM_TAKEOVER_RP_PAPERTYPE_ID+ " TEXT ,"
            + COLUMN_FLM_TAKEOVER_JP_PAPERTYPE_ID+ " TEXT,"
            + COLUMN_FLM_TAKEOVER_RP_RIBBONTYPE_ID+ " TEXT,"
            + COLUMN_FLM_TAKEOVER_JP_RIBBONTYPE_ID+ " TEXT)";

    //19 RNM_takeover
    private static final String createRNM_takeover= "CREATE TABLE " + TABLE_RNM_TAKEOVER+
            "(" + COLUMN_RNM_TAKEOVER_ID+ " INTEGER PRIMARY KEY AUTOINCREMENT ,"
            + COLUMN_RNM_TAKEOVER_LOBBY_ID+ " TEXT ,"
            + COLUMN_RNM_TAKEOVER_SIGNAGE_PHOTO+ " TEXT ,"
            + COLUMN_RNM_TAKEOVER_RNM_PHOTO2+ " TEXT)";

    //20 Ebill_takeover
    private static final String createEbill_takeover= "CREATE TABLE " + TABLE_EBILL_TAKEOVER+
            "(" + COLUMN_EBILL_TAKEOVER_ID+ " INTEGER PRIMARY KEY AUTOINCREMENT ,"
            + COLUMN_EBILL_TAKEOVER_LOBBY_ID+ " TEXT ,"
            + COLUMN_EBILL_TAKEOVER_CONSUMER_NO+ " TEXT ,"
            + COLUMN_EBILL_TAKEOVER_METER_NO+ " TEXT ,"
            + COLUMN_EBILL_TAKEOVER_LANDLORD_NAME+ " TEXT ,"
            + COLUMN_EBILL_TAKEOVER_LANDLORD_NO+ " TEXT ,"
            + COLUMN_EBILL_TAKEOVER_DISTRIBUTOR+ " TEXT)";

    public DBHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        try {
            db.execSQL(createBank); //1
            db.execSQL(createLobby); //2
            db.execSQL(createSupervisor); //3
            db.execSQL(createLobbySupervisorMapping); //4
            db.execSQL(createAadhar); //5
            db.execSQL(createCaretaker); //6
            db.execSQL(createCustomer); //7
            db.execSQL(createStatus); //8
            db.execSQL(createATM); //9
            db.execSQL(createTakeover); //10
            db.execSQL(createHandover); //11
            db.execSQL(createLobbyServiceMapping); //12
            db.execSQL(createCSR); //13
            db.execSQL(createRP_papertype); //14
            db.execSQL(createRP_ribbontype); //15
            db.execSQL(createJP_papertype); //16
            db.execSQL(createJP_ribbontype); //17
            db.execSQL(createFLM_takeover); //18
            db.execSQL(createRNM_takeover); //19
            db.execSQL(createEbill_takeover); //20


            Log.e(TAG, "In onCreate, Tables created successfully");

        } catch(SQLException e) {
            Log.e(TAG, e.toString());
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }


}

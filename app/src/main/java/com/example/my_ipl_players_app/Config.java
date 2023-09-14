package com.example.my_ipl_players_app;

import android.os.Environment;

import java.io.File;

public class Config {

        public static String[] Teams_name = {"Gujarat Titans", "Chennai super kings", "Lucknow Super Giants", "Royal Challengers Bangalore",
                "Mumbai Indian", "Kolkata Knight Riders", "Sunrisers Hyderabad", "Rajasthan Royals", "Delhi Capitals", "Punjab Kings"};
        public static int[] Teams_img = {R.drawable.gjarat_titans, R.drawable.chennai, R.drawable.luknow, R.drawable.royal,
                R.drawable.mumbai, R.drawable.kolkata, R.drawable.sunrisers, R.drawable.rajasthan, R.drawable.delhi, R.drawable.punjab};
        public static String[] Gujarat_titans_name = {"Hardik pandya(C)", "Shubaman Gill", "W saha", "Shanaka", "Miller", "Rahul tewatia", "Rashid khan", "Mohit sharma", "Noor ahmad", "Shami", "Yash dayal"};
        public static String[] Gujarat_titans_subname = {"Allrounder", "Batter", "Batter", "Allrounder", "Batter", "Allrounder", "Allrounder", "Bowler", "Bowler", "Bowler", "Bowler"};
        public static int[] Gujarat_titans_img = {R.drawable.hardik_pandya, R.drawable.shubman, R.drawable.w_saha, R.drawable.shanaka, R.drawable.miller,
                R.drawable.rahul_t, R.drawable.rashid, R.drawable.mohit, R.drawable.noor, R.drawable.shami, R.drawable.yash};
        public static String[] Chennai_name = {"Ms dhoni(C)", "Conway", "Ruturaj gaikwad", "Stokes", "Rayudu", "Moeen", "Ravindra jadeja", "Shivam dube", "santner", "D chahar", "Rajvardhan"};
        public static String[] Chennai_subname = {"Batter", "Batter", "Batter", "Allrounder", "Batter", "Allrounder", "Allrounder", "Bowler", "Bowler", "Bowler", "Bowler"};
        public static int[] Chennai_img = {R.drawable.msdhoni, R.drawable.conway, R.drawable.ruturaj, R.drawable.stokes, R.drawable.rayudu,
                R.drawable.moeen, R.drawable.ravindra, R.drawable.shivam, R.drawable.sentner, R.drawable.chahar, R.drawable.ravindra};
        public static String[] Lucknow_name = {"Rahul(C)", "K mayers", "Deepak hooda", "Stoinis", "Krunal pandya", "Pooran", "Ayush badoni", "Naveen_ul_haq", "Amit mishra", "Avesh khan", "Ravi bishnoi"};
        public static String[] Lacknow_subname = {"Allrounder", "Batter", "Batter", "Allrounder", "Batter", "Allrounder", "Allrounder", "Bowler", "Bowler", "Bowler", "Bowler"};
        public static int[] Lacknow_img = {R.drawable.klrahul, R.drawable.mayers, R.drawable.deepak, R.drawable.stoinis, R.drawable.krunal,
                R.drawable.pooran, R.drawable.ayush, R.drawable.naveen, R.drawable.amit, R.drawable.avesh, R.drawable.ravi};
        public static String[] Royal_Challengers_name = {"Du plessis(C)", "Kohli", "M bracewell", "Maxwell", "Lomror", "Anuj rawat", "Karthik", "Harshal patel", "Parnell", "Siraj", "Vijaykumar vyshak"};
        public static String[] Royal_Challengers_subname = {"Allrounder", "Batter", "Batter", "Allrounder", "Batter", "Allrounder", "Allrounder", "Bowler", "Bowler", "Bowler", "Bowler"};
        public static int[] Royal_Challengers_img = {R.drawable.du_plessis, R.drawable.kohli, R.drawable.m, R.drawable.maxwell, R.drawable.lomror,
                R.drawable.anuj, R.drawable.karthik, R.drawable.harshal, R.drawable.parnell, R.drawable.siraj, R.drawable.vijaykumar};
        public static int[] Mumbai_Indian_img = {R.drawable.rohit, R.drawable.anmolpreet, R.drawable.rahulbuddhi, R.drawable.surya,
                R.drawable.aryan, R.drawable.ishan, R.drawable.arjun, R.drawable.basil,
                R.drawable.jaydev, R.drawable.sanjay, R.drawable.ramandeep};
        public static String[] Mumbai_Indian_name = {"Rohit shrma(c)", "Anmolpreet", "Rahul", "Surya", "Aryan", "Ishan", "Arjun", "Basil", "Jaydev", "Sanjay", "Ramandeep"};
        public static String[] Mumbai_Indian_subname = {"Batsman", "Batsman", "Batsman", "Batsman", "Batsman", "Batsman", "Allrundor", "Boller", "Boller", "Allrundor", "Allrundor"};
        public static String[] Kolkata_Knight_Rider_name = {"Nitish rana(C)", "N jagadeesn", "Gurbaz", "Venkatesh lyer", "Rinku singh", "Russell", "Narine", "Wiese", "Thakur", "Harshit rana", "Chakaravarthy"};
        public static String[] Kolkata_Knight_Rider_subname = {"Allrounder", "Batter", "Batter", "Allrounder", "Batter", "Allrounder", "Allrounder", "Bowler", "Bowler", "Bowler", "Bowler"};
        public static int[] Kolkata_Knight_Rider_img = {R.drawable.nitish, R.drawable.n, R.drawable.gurbaz, R.drawable.vankatesh, R.drawable.rinku,
                R.drawable.russell, R.drawable.narine, R.drawable.wiese, R.drawable.thakur, R.drawable.rana, R.drawable.chakaravthy};
        public static String[] Sunrisers_Hyderabad_name = {"Markram(C)", "Abhishek sharma", "Tripathi", "Klaasen", "Abdul samad", "Sanvir singh", "Markande", "Marco jansen", "Bhuvneshawar", "Fazalhaq", "T natarajan"};
        public static String[] Sunrisers_Hyderabad_subname = {"Allrounder", "Batter", "Batter", "Allrounder", "Batter", "Allrounder", "Allrounder", "Bowler", "Bowler", "Bowler", "Bowler"};
        public static int[] Sunrisers_Hyderabad_img = {R.drawable.markram, R.drawable.abhisheks, R.drawable.tripathi, R.drawable.klaasen, R.drawable.abdul,
                R.drawable.sanvir, R.drawable.markande, R.drawable.marco, R.drawable.bhuvneshwar, R.drawable.fazalhaq, R.drawable.t};
        public static String[] Rajasthan_Royals_name = {"Samson(C)", "Jos buttler", "Yashasvi jaiswal", "Riyan parag", "Hetmayer", "Dhruv jurel", "Ashwin", "Boult", "Zampa", "Sandeep sharma", "Chahal"};
        public static String[] Rajasthan_Royals_subname = {"Allrounder", "Batter", "Batter", "Allrounder", "Batter", "Allrounder", "Allrounder", "Bowler", "Bowler", "Bowler", "Bowler"};
        public static int[] Rajasthan_Royals_img = {R.drawable.samson, R.drawable.jos, R.drawable.yashasvi, R.drawable.riyan, R.drawable.hetmayer,
                R.drawable.dhruv, R.drawable.ashwin, R.drawable.boult, R.drawable.zampa, R.drawable.sandeep, R.drawable.chahal};
        public static String[] Delhi_Capitals_name = {"Warner(C)", "Prithvi shaw", "Mitchell marsh", "Sarfaraz khan", "Axar", "Abhishek porel", "Aman hakim khan", "Kuldeep yadav", "Nortje", "Mukesh kumar", "Rossouw"};
        public static String[] Delhi_Capitals_subname = {"Allrounder", "Batter", "Batter", "Allrounder", "Batter", "Allrounder", "Allrounder", "Bowler", "Bowler", "Bowler", "Bowler"};
        public static int[] Delhi_Capitals_img = {R.drawable.warner, R.drawable.prithvi, R.drawable.mitchell, R.drawable.sarfaraz, R.drawable.axar,
                R.drawable.abhishek, R.drawable.aman, R.drawable.kuldeep, R.drawable.nortje, R.drawable.mukesh, R.drawable.rossouw};
        public static String[] Punjab_Kings_name = {"Dhawan(C)", "Prabhsimran", "Matthew short", "B rajapaksa", "Jitesh sharma", "Sum curran", "Shahrukh khan", "Harpreet brar", "Rabada", "Rishi dhawan", "Arshdeep singh"};
        public static String[] Punjab_Kings_subname = {"Allrounder", "Batter", "Batter", "Allrounder", "Batter", "Allrounder", "Allrounder", "Bowler", "Bowler", "Bowler", "Bowler"};
        public static int[] Punjab_Kings_img = {R.drawable.dhawan, R.drawable.parbhsimarn, R.drawable.shotr, R.drawable.b, R.drawable.jitesh,
                R.drawable.sum, R.drawable.shaharukh, R.drawable.brar, R.drawable.rabada, R.drawable.rishi, R.drawable.shingh};


        public static int gradArr[]={R.drawable.bg_gradient1,R.drawable.bg_gradient2,R.drawable.bg_gradient3,R.drawable.bg_gradient4,R.drawable.bg_gradient5};
        public static int colorArr[]={R.color.bg_color1,R.color.bg_color2,R.color.bg_color3,R.color.bg_color4,
                R.color.bg_color5,R.color.bg_color6,R.color.bg_color7,R.color.bg_color8,R.color.bg_color9,R.color.bg_color10,};

        public static String font[]={
                "BOD_CBI.TTF",
                "BRUSHSCI.TTF",
                "calibri.ttf" ,
                "calibrib.ttf" ,
                "FTLTLT.TTF",
                "COOPBL.TTF",
                "calibrili.ttf" ,};

        public static File file = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
    }

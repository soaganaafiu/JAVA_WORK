import java.util.Scanner;
public class Nokia{
    public static void main(String[] args){



        Scanner input = new Scanner(System.in);
        boolean mainMenu = true;

        do{
            String menu = """

                ================================================================
                                    Welcome to Nokia 5510
                ================================================================

                Select an [Option]

                1.  Phone book
                2.  Messages
                3.  Chat
                4.  Call register
                5.  Tones
                6.  Settings
                7.  Call divert
                8.  Music
                9.  Games
                10. Calculator
                11. Reminders
                12. Clock
                13. Profiles
                14. Services
                15. Sim services
                0.  Exit
                ================================================================
                """;






        System.out.println(menu);
        int menuChoice = input.nextInt();

        switch(menuChoice){

            case 1 -> {

                boolean nowInPhoneBook = true;

                do{

                    System.out.println("Phone Book");

                    String phoneBookList = """

                    ================================================================
                                            Phone Book List
                    ================================================================

                    1.  Search
                    2.  Service Nos
                    3.  Add name
                    4.  Erase
                    5.  Edit
                    6.  Copy
                    7.  Assign tone
                    8.  Send b’card
                    9.  Options
                    10. Speed dials
                    11. Voice tags
                    0.  Go Back

                    ================================================================

                    """;

        System.out.println(phoneBookList);
        int phoneBookMenuChoice = input.nextInt();

        switch(phoneBookMenuChoice){
            case 1 -> 
                    System.out.println("Search");
            case 2 -> 
                    System.out.println("Service Nos");
            case 3 -> 
                    System.out.println("Add name");
            case 4 -> 
                    System.out.println("Erase");
            case 5 -> 
                    System.out.println("Copy");
            case 6 -> 
                    System.out.println("Assign tone");
            case 7 -> 
                    System.out.println("Send b'card");
            case 8 -> 
                    System.out.println("Options");
            case 9 -> 
                    {

                boolean nowInListOfOptions = true;

                do{

                    System.out.println("""



                    ================================================================
                                            List of Options
                    ================================================================""");

                    String optionsList = """

                    1.  Memory in use
                    2.  Type of view
                    3.  Memory Status
                    0.  Back

                    ================================================================

""";
        System.out.println(optionsList);
        int optionsMenu = input.nextInt();
        switch(optionsMenu){
        
            case 1 -> 
                    System.out.println("Memory in use");
            case 2 -> 
                    System.out.println("Type of view"); 
            case 3 -> 
                    System.out.println("Memory Status");
            case 0 ->
                    nowInListOfOptions = false;
            default -> 
                    System.out.println("Enter right option.....");
        }
       
        }while(nowInListOfOptions);
        }

            case 10 -> 
                    System.out.println("Speed dials");
            case 11 -> 
                    System.out.println("Voice tags");
            case 0 ->
                    nowInPhoneBook = false;
            default -> 
                    System.out.println("Enter a valid Option.....");
            }
            }while(nowInPhoneBook);
        }










            case 2 -> {

                boolean nowInMessageSettings = true;

                do {

                    System.out.println("""
                    
                    ================================================================
                                            Message settings
                    ================================================================""");

                    String messageSettingsList = """

                    1.  Set
                    2.  Common
                    0.  Back

                    ================================================================

                    """;

                    System.out.println(messageSettingsList);

                    int messageSettingsMenu = input.nextInt();

                    switch (messageSettingsMenu) {

                        case 1 -> {

                            boolean nowInSet = true;

                            do {

                                System.out.println("""
                                
                                ================================================================
                                                    Set 1
                                ================================================================""");

                                String SetList = """

                                1.  Message Centre number
                                2.  Messages sent as
                                3.  Message validity
                                0.  Back

                                ================================================================

                                """;

                                System.out.println(SetList);

                                int SetMenu = input.nextInt();

                                switch (SetMenu) {

                                    case 1 ->
                                        System.out.println("Message Centre Number");

                                    case 2 ->
                                        System.out.println("Message Sent as");

                                    case 3 ->
                                        System.out.println("Message Validity");

                                    case 0 ->
                                        nowInSet = false;

                                    default ->
                                        System.out.println("Enter a valid Option.....");
                                }

                            } while (nowInSet);
                        }

                        case 2 -> {

                            boolean nowInCommon = true;

                            do {

                                System.out.println("""
                                
                                ================================================================
                                                    Common
                                ================================================================""");

                                String CommonList = """

                                1.  Delivery reports
                                2.  Reply via same centre
                                3.  Character support
                                0.  Back

                                ================================================================

                                """;

                                System.out.println(CommonList);

                                int CommonMenu = input.nextInt();

                                switch (CommonMenu) {

                                    case 1 ->
                                        System.out.println("Delivery reports");

                                    case 2 ->
                                        System.out.println("Reply via same centre");

                                    case 3 ->
                                        System.out.println("Character support");

                                    case 0 ->
                                        nowInCommon = false;

                                    default ->
                                        System.out.println("Enter a valid Option.....");
                                }

                            } while (nowInCommon);
                        }

                        case 0 ->
                            nowInMessageSettings = false;

                        default ->
                            System.out.println("Enter a valid Option.....");
                    }

                } while (nowInMessageSettings);

            }

            case 8 ->
                System.out.println("Info Services");

            case 9 ->
                System.out.println("Voice mailbox");

            case 10 ->
                System.out.println("Service command editor");

            case 0 ->
                nowInMessageSettings = false;
            default ->
                System.out.println("Enter a valid Option.....");






            case 3 -> 
                    System.out.println("Chat");









            case 4 -> 
                    {
                boolean nowInCallRegisterMenu = true;

                do{


                    System.out.println("Call register");


                    String callRegisterList = """

                    ================================================================
                                            Call Register Menu
                    ================================================================

                    1.  Missed calls
                    2.  Received calls
                    3.  Dialled numbers
                    4.  Erase recent call lists
                    5.  Show call duration
                    6.  Show call costs
                    7.  Call cost settings
                    8.  Prepaid credit
                    0.  Back
                    ================================================================

                    """;



        System.out.println(callRegisterList);
        int callRegisterMenu = input.nextInt();

        switch(callRegisterMenu){
            case 1 -> 
                    System.out.println("Missed calls");
            case 2 -> 
                    System.out.println("Received calls");
            case 3 -> 
                    System.out.println("Dialled numbers");
            case 4 -> 
                    System.out.println("Erase recent call lists");
            case 5 -> 
                    {

                boolean nowInShowCallDuration = true;

                do{

                    System.out.println("""

                ================================================================
                                        Show call duration
                ================================================================""");

                String callDurationList = """

                1.  Last call duration
                2.  All calls duration
                3.  Received calls’ duration
                4.  Dialled calls’ duration
                5.  Clear timers
                0.  Back
                ================================================================

                """;


        System.out.println(callDurationList);
        int callDurationMenu = input.nextInt();

        switch(callDurationMenu){
            case 1 -> 
                    System.out.println("Last call duration");
            case 2 -> 
                    System.out.println("All calls duration");
            case 3 -> 
                    System.out.println("Received calls’ duration");
            case 4 ->
                    System.out.println("Dialled calls’ duration");  
            case 5 ->
                    System.out.println("Clear timers"); 
            case 0 -> 
                    nowInShowCallDuration = false;
            default -> System.out.println("Enter a valid Option.....");
            }
            }while(nowInShowCallDuration);
        }

            case 6 -> 
                    {
                boolean nowInShowCallCosts = true;

                do{

                    System.out.println("""

                    ================================================================
                                                Show call costs
                    ================================================================""");

                    String callcostList = """

                    1.  Last call cost
                    2.  All calls cost
                    3.  Clear counters
                    0.  Back
                    ================================================================

                    """;


        System.out.println(callcostList);
        int callCostMenu = input.nextInt();

        switch(callCostMenu){
            case 1 -> 
                    System.out.println("Last call cost");
            case 2 -> 
                    System.out.println("All calls cost");
            case 3 -> 
                    System.out.println("Clear counters");
            case 0 -> 
                    nowInShowCallCosts = false;
            default -> System.out.println("Enter a valid Option.....");
            }
            }while(nowInShowCallCosts);
        }

            case 7 -> 
                    {
                boolean nowInCallCostSettings = true;

                do{

                    System.out.println("""

                    ================================================================
                                            Call cost settings
                    ================================================================""");

                    String callCostSettingsList = """

                    1.  Call cost limit
                    2.  Show costs in
                    0.  Back
                    ================================================================

                    """;


        System.out.println(callCostSettingsList);
        int callCostSettingsMenu = input.nextInt();

        switch (callCostSettingsMenu){
            case 1 -> 
                    System.out.println("Call cost limit");
            case 2 -> 
                    System.out.println("Show costs in");
            case 0 -> 
                    nowInCallCostSettings = false;
            default -> System.out.println("Enter a valid Option.....");
            }
            }while(nowInCallCostSettings);
        }

            case 8 -> 
                    System.out.println("Prepaid credit");
            case 0 -> 
                    nowInCallRegisterMenu = false;
            default -> System.out.println("Enter a valid Option.....");

            }
            }while(nowInCallRegisterMenu);
        }












            case 5 -> {System.out.println("Tones");

                boolean nowInTonesList = true;

                do{

                    String tonesList= """

                    ================================================================
                                                Tones List
                    ================================================================

                    1.  Ringing tone
                    2.  Ringing volume
                    3.  Incoming call alert
                    4.  Message alert tone
                    5.  Keypad tones
                    6.  Warning tones
                    7.  Vibrating alert
                    8.  Screen saver
                    0.  Back
                    ================================================================

""";

        System.out.println(tonesList);
        int tonesMenu = input.nextInt();

        switch(tonesMenu){
            case 1 -> 
                    System.out.println("Ringing tone");
            case 2 -> 
                    System.out.println("Ringing volume");
            case 3 -> 
                    System.out.println("Incoming call alert");
            case 4 -> 
                    System.out.println("Message alert tone");
            case 5 -> 
                    System.out.println("Keypad tones");
            case 6 -> 
                    System.out.println("Warning tones");
            case 7 -> 
                    System.out.println("Vibrating alert");
            case 8 -> 
                    System.out.println("Screen saver");
            case 0 -> 
                    nowInTonesList = false;
            default -> 
                    System.out.println("Enter right option.....");

        }
        }while(nowInTonesList);
    }















            case 6 -> {

                boolean nowInSettingsList = true;

                do{

            System.out.println("Settings");


            String settingsList = """

                    ================================================================
                                            Settings Menu
                    ================================================================


                    1.  Call settings
                    2.  Phone settings
                    3.  Security settings
                    4.  Restore factory settings
                    0.  Back
                    ================================================================

""";



        System.out.println(settingsList);
        int settingsMenu = input.nextInt();

        switch(settingsMenu){

            case 1 -> 
                    {
                boolean nowInCallSettings = true;

                do{


                        System.out.println("""

                    ================================================================
                                                Call settings
                    ================================================================""");

                    String callSettingsList = """

                    1.  Automatic redial
                    2.  Speed dialling
                    3.  Call waiting options
                    4.  Own number sending
                    5.  Phone line in use
                    6.  Automatic answer
                    0.  Back
                    ================================================================

""";


        System.out.println(callSettingsList);
        int callSettingsMenu = input.nextInt();

        switch(callSettingsMenu){
            case 1 -> 
                    System.out.println("Automatic redial");
            case 2 -> 
                    System.out.println("Speed dialling");
            case 3 -> 
                    System.out.println("Call waiting options");
            case 4 ->
                    System.out.println("Own number sending");  
            case 5 ->
                    System.out.println("Phone line in use"); 
            case 6 ->
                    System.out.println("Automatic answer");
            case 0 -> 
                    nowInCallSettings = false;
            default -> 
                    System.out.println("Enter right option.....");
            }
            }while(nowInCallSettings);
        }


            case 2 -> 
                    {
                boolean nowInPhoneSettings = true;

                do{


                        System.out.println("""

                    ================================================================
                                            Phone Settings
                    ================================================================""");

                    String phoneSettingsList = """

                    1.  Language
                    2.  Cell info display
                    3.  Welcome note
                    4.  Network selection
                    5.  Confirm SIM service actions
                    0.  Back
                    ================================================================

""";


        System.out.println(phoneSettingsList);
        int phoneSettingsMenu = input.nextInt();

        switch(phoneSettingsMenu){
            case 1 -> 
                    System.out.println("Language");
            case 2 -> 
                    System.out.println("Cell info display");
            case 3 -> 
                    System.out.println("Welcome note");
            case 4 -> 
                    System.out.println("Network selection");
            case 5 -> 
                    System.out.println("Confirm SIM service actions");
            case 0 -> 
                    nowInPhoneSettings = false;
            default -> 
                    System.out.println("Enter right option.....");
            }
            }while(nowInPhoneSettings);
        }

            case 3 -> 
                    {

                boolean nowInSecuritySettings = true;

                do{

                        System.out.println("""

                    ================================================================
                                            Security settings
                    ================================================================""");

                    String securitySettingsList = """

                    1.  PIN code request
                    2.  Call barring service
                    3.  Fixed dialling
                    4.  Closed user group
                    5.  Security level
                    6.  Change access codes
                    0.  Back
                    ================================================================

""";


        System.out.println(securitySettingsList);
        int securitySettingsMenu = input.nextInt();

        switch (securitySettingsMenu){
            case 1 -> 
                    System.out.println("PIN code request");
            case 2 -> 
                    System.out.println("Call barring service");
            case 3 -> 
                    System.out.println("Fixed dialling");
            case 4 -> 
                    System.out.println("Closed user group");
            case 5 -> 
                    System.out.println("Security level");
            case 6 -> 
                    System.out.println("Change access codes");
            case 0 -> 
                    nowInSecuritySettings = false;
            default -> 
                    System.out.println("Enter right option.....");
                }
            }while(nowInSecuritySettings);
        }

            case 4 -> 
                    System.out.println("Restore factory settings");
            case 0 -> 
                    nowInSettingsList = false;
            default -> 
                    System.out.println("Enter right option.....");
            }
        }while(nowInSettingsList);
        }











            case 7 -> 
                    System.out.println("Call divert");






            case 8 -> {

                boolean nowInMusicList = true;

                do{

                    System.out.println("Music");

                    String musicList= """

                    ================================================================
                                                Music List
                    ================================================================

                    1.  Music player
                    2.  Radio
                    3.  Recorder
                    4.  Track list
                    0.  Back
                    ================================================================

""";

        System.out.println(musicList);
        int musicMenu = input.nextInt();

        switch(musicMenu){
            case 1 -> 
                    System.out.println("Music player");
            case 2 -> 
                    System.out.println("Radio");
            case 3 -> 
                    System.out.println("Recorder");
            case 4 -> 
                    System.out.println("Track list");
            case 0 -> 
                    nowInMusicList = false;
            default -> 
                    System.out.println("Enter right option.....");

        }
        }while(nowInMusicList);
    }



            case 9 -> 
                    System.out.println("Games");




            case 10 -> 
                    System.out.println("Calculator");




            case 11 -> 
                    System.out.println("Reminders");






            case 12 -> {

                boolean nowInClockList = true;

                do{

                    System.out.println("Clock");

                    String clockList= """

                    ================================================================
                                                Clock List
                    ================================================================

                    1.  Alarm clock
                    2.  Clock settings
                    3.  Date setting
                    4.  Stopwatch
                    5.  Countdown timer
                    6.  Auto update of date and time
                    0.  Back
                    ================================================================

""";

        System.out.println(clockList);
        int clockMenu = input.nextInt();

        switch(clockMenu){
            case 1 -> 
                    System.out.println("Alarm clock");
            case 2 -> 
                    System.out.println("Clock settings");
            case 3 ->
                    System.out.println("Date setting");
            case 4 -> 
                    System.out.println("Stopwatch");
            case 5 -> 
                    System.out.println("Countdown timer");
            case 6-> 
                    System.out.println("Auto update of date and time");
            case 0 -> 
                    nowInClockList = false;
            default -> 
                    System.out.println("Enter right option.....");
        }
        }while(nowInClockList);
    }



            case 13 -> 
                    System.out.println("Profiles");



            case 14 -> 
                    System.out.println("Services");



            case 15 -> 
                    System.out.println("SIM services");



            case 0 ->{
                    System.out.println("Power Off");
                    mainMenu = false;
            }


            default -> 
                    System.out.println("Enter right option.....");  
            } 
        }
        while(mainMenu);
    }
}

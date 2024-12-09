import java.util.*;

import java.io.IOException;

 

public class DoctorAppointmentSystem {

   ArrayList<String> doctorName = new ArrayList<>();

   ArrayList<String> doctorQualification = new ArrayList<>();

   ArrayList<String> doctorGender = new ArrayList<>();

   ArrayList<String> doctorPassword = new ArrayList<>();

   ArrayList<Integer> doctorAge = new ArrayList<>();

   ArrayList<Long> doctorMobileNumber = new ArrayList<>();

   ArrayList<String> doctorCity = new ArrayList<>();

 

   ArrayList<Integer> patientAge = new ArrayList<>();

   ArrayList<String> patientName = new ArrayList<>();

   ArrayList<String> patientGender = new ArrayList<>();

   ArrayList<String> patientPassword = new ArrayList<>();

   ArrayList<Long> patientMobileNumber = new ArrayList<>();

 

   ArrayList<Integer> patientAgeBooking = new ArrayList<>();

   ArrayList<String> patientNameBooking = new ArrayList<>();

   ArrayList<String> patientGenderBooking = new ArrayList<>();

   ArrayList<Byte> doctorID = new ArrayList<>();

 

   void dataAdd() { // Method for creating default doctor list present in the database.

       doctorName.add("Nagarjun Raut");

       doctorName.add("Ankush Nag");

       doctorName.add("Prashant Jha");

       doctorName.add("Ashish Gadpayle");

       doctorName.add("Sandip Paul");

       doctorName.add("Himanshu Pokhle");

       doctorName.add("Amit Mule");

 

       doctorQualification.add("MBBS");

       doctorQualification.add("Er, MBBS");

       doctorQualification.add("MBBS, MD");

       doctorQualification.add("MBBS,MD");

       doctorQualification.add("BAMS");

       doctorQualification.add("MBBS, MD, Surgeon");

       doctorQualification.add("BAMS");

 

       doctorGender.add("M");

       doctorGender.add("M");

       doctorGender.add("M");

       doctorGender.add("M");

       doctorGender.add("M");

       doctorGender.add("M");

       doctorGender.add("M");

 

       doctorPassword.add("Nagarjun123");

       doctorPassword.add("Ankush123");

       doctorPassword.add("Prashant123");

       doctorPassword.add("Ashish123");

       doctorPassword.add("Sandip123");

       doctorPassword.add("Himanshu123");

       doctorPassword.add("Amit123");

 

       doctorAge.add(25);

       doctorAge.add(24);

       doctorAge.add(29);

       doctorAge.add(29);

       doctorAge.add(28);

       doctorAge.add(23);

       doctorAge.add(30);

 

       doctorMobileNumber.add(9422887565L);

       doctorMobileNumber.add(123L);

       doctorMobileNumber.add(123L);

       doctorMobileNumber.add(123L);

       doctorMobileNumber.add(123L);

       doctorMobileNumber.add(123L);

       doctorMobileNumber.add(123L);

 

       doctorCity.add("Gondiya");

       doctorCity.add("Ranchi");

       doctorCity.add("Nagpur");

       doctorCity.add("Nagpur");

       doctorCity.add("Mumbai");

       doctorCity.add("Delhi");

       doctorCity.add("Chennai");

   }

 

   void admin() {

       Scanner sc = new Scanner(System.in);

       byte choice;

       boolean flag = true;

 

       while (flag) {

           try {

               clearConsole();

           } catch (IOException | InterruptedException e) {

               System.out.println("Error clearing console: " + e.getMessage());

           }

           System.out.println("\t\t  _________________________");

           System.out.println("\t\t |                         |");

           System.out.println("\t\t |       Welcome Admin     |");

           System.out.println("\t\t |_________________________|");

           System.out.print("\n\n1. Doctor list \t2. Registered Patients \t3.Patients with Appointment  \n\nEnter Your Choice.");

           choice = sc.nextByte();

           switch (choice) {

               case 1:

                   for (int i = 0; i < doctorName.size(); i++) {

                       System.out.println("Name: \t " + doctorName.get(i));

                   }

                   navigateBack(sc);

                   break;

 

               case 2:

                   if (patientName.isEmpty()) {

                       System.out.println("No Registered Patients yet.");

                       try {

                           Thread.sleep(3000);

                       } catch (InterruptedException e) {

                           System.out.println("Sleep interrupted: " + e.getMessage());

                       }

                   } else {

                       for (int i = 0; i < patientName.size(); i++) {

                           System.out.println(i + ". " + patientName.get(i));

                       }

                       navigateBack(sc);

                   }

                   break;

 

               case 3:

                   if (patientNameBooking.isEmpty()) {

                       System.out.println("\nNo Appointments yet.");

                       try {

                           Thread.sleep(3000);

                       } catch (InterruptedException e) {

                           System.out.println("Sleep interrupted: " + e.getMessage());

                       }

                   } else {

                       for (int i = 0; i < patientNameBooking.size(); i++) {

                           System.out.println(i + ". " + patientNameBooking.get(i));

                       }

                       try {

                           Thread.sleep(5000);

                       } catch (InterruptedException e) {

                           System.out.println("Sleep interrupted: " + e.getMessage());

                       }

                       flag = false;

                   }

                   break;

 

               default:

                   System.out.println("Wrong choice");

                   try {

                       Thread.sleep(1000);

                   } catch (InterruptedException e) {

                       System.out.println("Sleep interrupted: " + e.getMessage());

                   }

           }

       }

   }

 

   void patient() {

       Scanner sc = new Scanner(System.in);

       boolean flag = true;

       while (flag) {

           try {

               clearConsole();

           } catch (IOException | InterruptedException e) {

               System.out.println("Error clearing console: " + e.getMessage());

           }

           System.out.println("\t\t  _________________________");

           System.out.println("\t\t |                         |");

           System.out.println("\t\t | Welcome to Patient Page!|");

           System.out.println("\t\t |_________________________|");

           System.out.println(" ");

           System.out.println("1.Login \t 2.Registration\n");

           int ch = sc.nextInt();

           switch (ch) {

               case 1:

                   if (patientMobileNumber.isEmpty()) {

                       System.out.println("First register yourself then login..!");

                       try {

                           Thread.sleep(500);

                       } catch (InterruptedException e) {

                           System.out.println("Sleep interrupted: " + e.getMessage());

                       }

                   } else {

                       try {

                           patientLogin();

                       } catch (Exception e) {

                           System.out.println("Error during patient login: " + e.getMessage());

                       }

                       flag = false;

                   }

                   break;

               case 2:

                   try {

                       patientRegistration();

                   } catch (IOException e) {

                       System.out.println("Error during patient registration: " + e.getMessage());

                   }

                   flag = false;

                   break;

 

               default:

                   System.out.println("\nYou entered wrong choice. Enter your choice again....!!!");

                   try {

                       Thread.sleep(1000);

                   } catch (InterruptedException e) {

                       System.out.println("Sleep interrupted: " + e.getMessage());

                   }

           }

       }

   }

 

   void doctor() {

       Scanner sc = new Scanner(System.in);

       int choice;

       boolean flag = true;

       while (flag) {

           try {

               clearConsole();

           } catch (IOException | InterruptedException e) {

               System.out.println("Error clearing console: " + e.getMessage());

           }

           System.out.println("\t\t  _________________________");

           System.out.println("\t\t |                         |");

           System.out.println("\t\t | Welcome to Doctor Page! |");

           System.out.println("\t\t |_________________________|");

           System.out.println(" ");

           System.out.println("1. Login \t 2.Registration");

           choice = sc.nextInt();

 

           switch (choice) {

               case 1:

                   if (doctorMobileNumber.isEmpty()) {

                       System.out.println("Register first...!");

                       flag = false;

                       try {

                           Thread.sleep(500);

                       } catch (InterruptedException e) {

                           System.out.println("Sleep interrupted: " + e.getMessage());

                       }

                   } else {

                       try {

                           doctorLogin();

                       } catch (Exception e) {

                           System.out.println("Error during doctor login: " + e.getMessage());

                       }

                       flag = false;

                   }

                   break;

               case 2:

                   try {

                       doctorRegistration();

                   } catch (IOException e) {

                       System.out.println("Error during doctor registration: " + e.getMessage());

                   }

                   flag = false;

                   break;

 

               default:

                   System.out.println("Entered Wrong choice..");

           }

       }

   }

 

   void patientLogin() throws Exception {

       Scanner sc = new Scanner(System.in);

       boolean flag = true;

       long mobileNumber;

       byte choice;

       try {

           clearConsole();

       } catch (IOException | InterruptedException e) {

           System.out.println("Error clearing console: " + e.getMessage());

       }

       System.out.println("\t\t  _________________________");

       System.out.println("\t\t |                         |");

       System.out.println("\t\t |         Login           |");

       System.out.println("\t\t |_________________________|");

 

       System.out.println("Enter your Username(mobile number)");

       mobileNumber = sc.nextLong();

       System.out.println("Enter your Password");

       String password = sc.next();

 

       boolean flag1 = false;

       for (int i = 0; i < patientMobileNumber.size(); i++) {

           if (patientMobileNumber.get(i).equals(mobileNumber) && patientPassword.get(i).equals(password)) {

               flag1 = true;

               break;

           }

       }

       if (flag1) {

           try {

               clearConsole();

           } catch (IOException | InterruptedException e) {

               System.out.println("Error clearing console: " + e.getMessage());

           }

           System.out.println("\t\t  _________________________");

           System.out.println("\t\t |                         |");

           System.out.println("\t\t |        Welcome!         |");

           System.out.println("\t\t |_________________________|");

 

           System.out.println("1.Book Appointment \n2. View your Appointments");

           choice = sc.nextByte();

 

           switch (choice) {

               case 1:

                   bookAppointment(sc, mobileNumber);

                   break;

               case 2:

                   viewAppointments(mobileNumber);

                   break;

               default:

                   System.out.println("Invalid choice");

                   try {

                       Thread.sleep(1000);

                   } catch (InterruptedException e) {

                       System.out.println("Sleep interrupted: " + e.getMessage());

                   }

           }

       } else {

           System.out.println("\nInvalid Username or Password");

           try {

               Thread.sleep(3000);

           } catch (InterruptedException e) {

               System.out.println("Sleep interrupted: " + e.getMessage());

           }

       }

   }

 

   private void bookAppointment(Scanner sc, long mobileNumber) {

       boolean flag = true;

       byte choice;

       System.out.println("\t\t  _________________________");

       System.out.println("\t\t |                         |");

       System.out.println("\t\t |    Book Appointment     |");

       System.out.println("\t\t |_________________________|");

 

       for (int i = 0; i < doctorName.size(); i++) {

           System.out.println(i + 1 + ". " + doctorName.get(i) + "\t" + doctorQualification.get(i));

       }

       System.out.println("Enter Doctor ID to book appointment");

       choice = sc.nextByte();

 

       while (flag) {

           if (choice > 0 && choice <= doctorName.size()) {

               doctorID.add(choice);

               int index = patientMobileNumber.indexOf(mobileNumber);

               patientNameBooking.add(patientName.get(index));

               patientAgeBooking.add(patientAge.get(index));

               patientGenderBooking.add(patientGender.get(index));

               System.out.println("Enter your age:");

               patientAgeBooking.add(sc.nextInt());

               System.out.println("Enter your Gender: (M/F/T) \t");

               patientGenderBooking.add(sc.next().toUpperCase());

               System.out.println("\n\t  You booked Appointment Successfully with Dr." + doctorName.get(choice - 1));

               System.out.println("Press any key to go back.");

               sc.next();

               flag = false;

           } else {

               System.out.println("\nYou have entered wrong Doctor ID.\n Re-enter your choice");

               choice = sc.nextByte();

               doctorID.add(choice);

           }

       }

   }

 

   private void viewAppointments(long mobileNumber) {

       int index = patientMobileNumber.indexOf(mobileNumber);

       String patientName = this.patientName.get(index);

 

       System.out.println("Your appointments:");

       for (int i = 0; i < patientNameBooking.size(); i++) {

           if (patientNameBooking.get(i).equals(patientName)) {

               System.out.println("Doctor: " + doctorName.get(doctorID.get(i) - 1));

               System.out.println("Age: " + patientAgeBooking.get(i));

               System.out.println("Gender: " + patientGenderBooking.get(i));

           }

       }

   }

 

   void doctorLogin() throws Exception {

       Scanner sc = new Scanner(System.in);

       try {

           clearConsole();

       } catch (IOException | InterruptedException e) {

           System.out.println("Error clearing console: " + e.getMessage());

       }

       System.out.println("\t\t  _________________________");

       System.out.println("\t\t |                         |");

       System.out.println("\t\t |         Login           |");

       System.out.println("\t\t |_________________________|");

 

       System.out.println("Enter your Username(mobile number)");

       long mobileNumber = sc.nextLong();

       System.out.println("Enter your Password");

       String password = sc.next();

 

       boolean flag1 = false;

       for (int j = 0; j < doctorMobileNumber.size(); j++) {

           if (doctorMobileNumber.get(j).equals(mobileNumber) && doctorPassword.get(j).equals(password)) {

               flag1 = true;

               break;

           }

       }

       if (flag1) {

           try {

               clearConsole();

           } catch (IOException | InterruptedException e) {

               System.out.println("Error clearing console: " + e.getMessage());

           }

           System.out.println("\t\t  _________________________");

           System.out.println("\t\t |                         |");

           System.out.println("\t\t |     Appointments        |");

           System.out.println("\t\t |_________________________|");

 

           if (patientNameBooking.isEmpty()) {

               System.out.println("No Appointments yet.");

           } else {

               for (int i = 0; i < patientNameBooking.size(); i++) {

                   System.out.println("Name: \t" + patientNameBooking.get(i) + "\t Age: \t" + patientAgeBooking.get(i) + "\t Gender: \t" + patientGenderBooking.get(i));

               }

           }

           System.out.println("Press any key to go back.");

           sc.next();

       } else {

           System.out.println("\nInvalid Username or Password");

           try {

               Thread.sleep(3000);

           } catch (InterruptedException e) {

               System.out.println("Sleep interrupted: " + e.getMessage());

           }

       }

   }

 

   void doctorRegistration() throws IOException {

       Scanner sc = new Scanner(System.in);

       try {

           clearConsole();

       } catch (IOException | InterruptedException e) {

           System.out.println("Error clearing console: " + e.getMessage());

       }

       System.out.println("\t\t  _________________________");

       System.out.println("\t\t |                         |");

       System.out.println("\t\t |   Doctor Registration   |");

       System.out.println("\t\t |_________________________|");

       System.out.println("Enter your Name:");

       doctorName.add(sc.nextLine());

       System.out.println("Enter your Qualification:");

       doctorQualification.add(sc.next());

       System.out.println("Enter your Gender(M/F/T):");

       doctorGender.add(sc.next().toUpperCase());

       System.out.println("Enter your Age:");

       doctorAge.add(sc.nextInt());

       System.out.println("Enter your Mobile Number:");

       doctorMobileNumber.add(sc.nextLong());

       System.out.println("Enter your City:");

       sc.nextLine(); // consume newline

       doctorCity.add(sc.nextLine());

       System.out.println("Set your Password:");

       doctorPassword.add(sc.next());

 

       System.out.println("\nRegistration Successful!\nRedirecting to Doctor Login page....");

   }

 

   void patientRegistration() throws IOException {

       Scanner sc = new Scanner(System.in);

       try {

           clearConsole();

       } catch (IOException | InterruptedException e) {

           System.out.println("Error clearing console: " + e.getMessage());

       }

       System.out.println("\t\t  _________________________");

       System.out.println("\t\t |                         |");

       System.out.println("\t\t |  Patient Registration   |");

       System.out.println("\t\t |_________________________|");

 

       System.out.println("Enter your Name:");

       patientName.add(sc.nextLine());

       System.out.println("Enter your Age:");

       patientAge.add(sc.nextInt());

       System.out.println("Enter your Gender(M/F/T):");

       patientGender.add(sc.next().toUpperCase());

       System.out.println("Enter your Mobile Number:");

       patientMobileNumber.add(sc.nextLong());

       System.out.println("Set your Password:");

       patientPassword.add(sc.next());

 

       System.out.println("\nRegistration Successful!\nRedirecting to Patient Login page....");

   }

 

   void clearConsole() throws IOException, InterruptedException {

       if (System.getProperty("os.name").contains("Windows")) {

           new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

       } else {

           System.out.print("\033[H\033[2J");

           System.out.flush();

       }

   }

 

   void navigateBack(Scanner sc) {

       System.out.println("Press any key to go back.");

       sc.next();

       try {

           clearConsole();

       } catch (IOException | InterruptedException e) {

           System.out.println("Error clearing console: " + e.getMessage());

       }

   }

 

   public static void main(String[] args) throws Exception {

       DoctorAppointmentSystem system = new DoctorAppointmentSystem();

       system.dataAdd();

       Scanner sc = new Scanner(System.in);

       while (true) {

           try {

               system.clearConsole();

           } catch (IOException | InterruptedException e) {

               System.out.println("Error clearing console: " + e.getMessage());

           }

           System.out.println("\t\t  _________________________");

           System.out.println("\t\t |                         |");

           System.out.println("\t\t |    Welcome to Doctor    |");

           System.out.println("\t\t |  Appointment System!    |");

           System.out.println("\t\t |_________________________|");

           System.out.println(" ");

           System.out.println("1. Admin \t 2. Doctor \t 3. Patient \t 4.Exit");

           System.out.println("\nEnter your choice: ");

           byte choice = sc.nextByte();

           switch (choice) {

               case 1:

                   system.admin();

                   break;

               case 2:

                   system.doctor();

                   break;

               case 3:

                   system.patient();

                   break;

               case 4:

                   System.exit(0);

               default:

                   System.out.println("Invalid choice");

           }

       }

   }

}
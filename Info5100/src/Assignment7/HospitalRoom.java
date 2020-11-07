package Assignment7;

import java.util.ArrayList;
import java.util.List;

public class HospitalRoom {
    

	   private final Object doctorLock = new Object();
	   private final Object patientLock = new Object();
	   private List<Doctor> inRoomDoctor = new ArrayList<>();
	   private List<Patient> inRoomPatient = new ArrayList<>();
	   private final int ROOM_LIMIT = 3;



	   public boolean doctorEnter(Doctor d) throws InterruptedException {

	       synchronized (doctorLock) {
	           //If no Doctor is in the room, add doctor d to the room
	           if (inRoomDoctor.size() == 0) {

	               inRoomDoctor.add(d);
	               System.out.println("Doctor " + d.name + " Entered, Number of Doctor " + inRoomDoctor.size());

	               doctorLock.notify();
	               return true;

	           } else {
	               System.out.println("Doctor " + d.name + " is waiting to Enter, Number of Doctor " + inRoomDoctor.size());

	               doctorLock.wait();
	               return false;
	           }

	       }

	   }

	   public boolean doctorLeave(Doctor d) throws InterruptedException {

	       synchronized (doctorLock) {
	           //If no doctor is in the room, just wait
	           if (inRoomDoctor.size() == 0) {
	               doctorLock.wait();
	               return false;
	               //If doctor is in the room then remove doctor
	           } else {
	               inRoomDoctor.remove(d);
	               doctorLock.notify();
	               System.out.println("Doctor " + d.name + " left, Number of doctor " + inRoomDoctor.size());
	               return true;
	           }

	       }
	   }

	   public boolean patientEnter(Patient p) throws InterruptedException {
	       synchronized (patientLock){
	           //while there are no more than 3 patient in the room, add patient to the list
	           if (inRoomPatient.size() < ROOM_LIMIT) {
	               inRoomPatient.add(p);
	               System.out.println("Patient " + p.name + " Entered, Number of Patient " + inRoomPatient.size());
	               patientLock.notify();
	               return true;
	           } else{
	               System.out.println("Patient " + p.name + " is waiting to enter, number of patients " + inRoomPatient.size());
	               patientLock.wait();
	               return false;
	           }
	       }
	   }

	   public boolean patientLeave(Patient p) throws InterruptedException {
	       synchronized (patientLock){
	           if(inRoomPatient.size() == ROOM_LIMIT) {
	               inRoomPatient.remove(p);
	               System.out.println("Patient " + p.name + " left the Room.  Number of Patient " + inRoomPatient.size());
	               patientLock.notify();
	               return true;
	           } else {
	               patientLock.wait();
	               return false;
	           }
	       }
	   }

	}

	class Doctor {
	   public String name;

	   public Doctor(String name) {
	       this.name = name;
	   }
	}

	class Patient {
	   public String name;

	   public Patient(String name) {
	       this.name = name;
	   }
	}

	class Main2 {
	   public static void main(String[] args) {
	       HospitalRoom room = new HospitalRoom();
	       Doctor siva = new Doctor("siva");
	       Doctor john = new Doctor("john");
	       Patient p1 = new Patient("p1");
	       Patient p2 = new Patient("p2");
	       Patient p3= new Patient("p3");
	       Patient p4 = new Patient("p4");
	       Patient p5 = new Patient("p5");

	       Thread doctor1 = new Thread(() -> {
	           try {
	               while(!room.doctorEnter(siva)) {}
	               Thread.sleep(500);
	               while(!room.doctorLeave(siva)) {}

	           } catch (InterruptedException e) {
	               e.printStackTrace();
	           }
	       });

	       Thread doctor2 = new Thread(() -> {
	           try {
	               while(!room.doctorEnter(john)) {}
	               Thread.sleep(500);
	               while(!room.doctorLeave(john)) {}
	           } catch (InterruptedException e) {
	               e.printStackTrace();
	           }
	       });

	       Thread patient1 = new Thread(() -> {
	           try {
	               while(!room.patientEnter(p1)) {}
	               Thread.sleep(500);
	               while(!room.patientLeave(p1)) {}
	           } catch (InterruptedException e) {
	               e.printStackTrace();
	           }
	       });

	       Thread patient2 = new Thread(() -> {
	           try {
	               while(!room.patientEnter(p2)) {};
	               Thread.sleep(500);
	               while(!room.patientLeave(p2)) {};
	           } catch (InterruptedException e) {
	               e.printStackTrace();
	           }
	       });

	       Thread patient3 = new Thread(() -> {
	           try {
	               while(!room.patientEnter(p3)) {};
	               Thread.sleep(500);
	               while(!room.patientLeave(p3)) {};
	           } catch (InterruptedException e) {
	               e.printStackTrace();
	           }
	       });

	       Thread patient4 = new Thread(() -> {
	           try {
	               while(!room.patientEnter(p4)) {};
	               Thread.sleep(500);
	               while(!room.patientLeave(p4)) {};
	           } catch (InterruptedException e) {
	               e.printStackTrace();
	           }
	       });

	       Thread patient5 = new Thread(() -> {
	           try {
	               while(!room.patientEnter(p5)) {};
	               Thread.sleep(500);
	               while(!room.patientLeave(p5)) {};
	           } catch (InterruptedException e) {
	               e.printStackTrace();
	           }
	       });

	       doctor1.start();
	       doctor2.start();
	       patient1.start();
	       patient2.start();
	       patient3.start();
	       patient4.start();
	       patient5.start();
	   }


}

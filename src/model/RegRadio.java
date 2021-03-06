package model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class RegRadio {

	private int id;
	private LocalDateTime startDate;
	private Date endDate;
	private Date arrivalDate;
	private String batchNumber;
	private String contaminationControll;
	private String calibrationInfo;
	private Room room;
	private User user;
	private Radiopharmaceutical radiopharmaceutical;
	private Double startActivity;
	private Supplier supplier;
	private LocalDateTime calibrationDate;
	private Double calibrationActivity;

	
	public RegRadio(double startActivity, LocalDateTime start, Date arrivalDate, String batchNumber, 
			String conControll, Radiopharmaceutical radiopharmaceutical, Room room, User user) {
		super();
		this.startActivity = startActivity;
		startDate = start;
		this.arrivalDate = arrivalDate;
		this.batchNumber = batchNumber;
		contaminationControll = conControll;
		this.user=user;
		this.room = room;
		this.user = user;
		this.startActivity = startActivity;		
		this.radiopharmaceutical = radiopharmaceutical;
	}
	
	public RegRadio(int id, double startActivity, LocalDateTime start, Date arrivalDate, String batchNumber, 
			String conControll, Radiopharmaceutical radiopharmaceutical, Room room, User user) {

		super();
		this.id = id;
		this.startActivity = startActivity;
		startDate = start;
		endDate = null;
		this.arrivalDate = arrivalDate;
		this.batchNumber = batchNumber;
		contaminationControll = conControll;
		this.user=user;
		this.room = room;
		this.user = user;
		this.startActivity = startActivity;		
		this.radiopharmaceutical = radiopharmaceutical;
	}

	public RegRadio(double startActivity, LocalDateTime start, Date arrivalDate, String batchNumber, 
			String conControll, Radiopharmaceutical radiopharmaceutical, Room room, User user, Double calibrationActivity, LocalDateTime calibrationDate, Supplier supplier) {

		super();
		this.startActivity = startActivity;
		startDate = start;
		endDate = null;
		this.arrivalDate = arrivalDate;
		this.batchNumber = batchNumber;
		contaminationControll = conControll;
		this.user=user;
		this.room = room;
		this.user = user;
		this.startActivity = startActivity;		
		this.radiopharmaceutical = radiopharmaceutical;
		this.calibrationDate = calibrationDate;
		this.calibrationActivity = calibrationActivity;
		this.setSupplier(supplier);
	}
	


	public RegRadio(double startActivity, LocalDateTime start, Date arrivalDate, String batchNumber, 
			String conControll, Radiopharmaceutical radiopharmaceutical, Room room, User user, Double calibrationActivity, LocalDateTime calibrationDate) {

		super();
		this.startActivity = startActivity;
		startDate = start;
		endDate = null;
		this.arrivalDate = arrivalDate;
		this.batchNumber = batchNumber;
		contaminationControll = conControll;
		this.user=user;
		this.room = room;
		this.user = user;
		this.startActivity = startActivity;		
		this.radiopharmaceutical = radiopharmaceutical;
		this.calibrationDate = calibrationDate;
		this.calibrationActivity = calibrationActivity;
	}
  
	public RegRadio(int id, double startActivity, LocalDateTime start, Date arrivalDate, String batchNumber, 
			String conControll, Radiopharmaceutical radiopharmaceutical, Room room, User user, Double calibrationActivity, LocalDateTime calibrationDate) {

		super();
		this.id = id;
		this.startActivity = startActivity;
		startDate = start;
		endDate = null;
		this.arrivalDate = arrivalDate;
		this.batchNumber = batchNumber;
		contaminationControll = conControll;
		this.user=user;
		this.room = room;
		this.user = user;
		this.startActivity = startActivity;		
		this.radiopharmaceutical = radiopharmaceutical;
		this.supplier=radiopharmaceutical.getSupplier();
		this.calibrationDate = calibrationDate;
		this.calibrationActivity = calibrationActivity;
	}
	
	public RegRadio(double startActivity, LocalDateTime start, Date arrivalDate, String batchNumber, 
			String conControll, Radiopharmaceutical radiopharmaceutical, Room room, User user, Supplier supplier) {
		super();
		this.startActivity = startActivity;
		startDate = start;
		endDate = null;
		this.arrivalDate = arrivalDate;
		this.batchNumber = batchNumber;
		contaminationControll = conControll;
		this.user=user;
		this.room = room;
		this.user = user;
		this.startActivity = startActivity;		
		this.radiopharmaceutical = radiopharmaceutical;
		this.setSupplier(supplier);
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public LocalDateTime getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDateTime startDate) {
		this.startDate = startDate;
	}
	public LocalDateTime getCalibrationDate() {
		return calibrationDate;
	}
	public void setCalibrationsDate() {
		this.calibrationDate = LocalDateTime.now();
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public Date getArrivalDate() {
		return arrivalDate;
	}
	public void setArrivalDate(Date arrivalDate) {
		this.arrivalDate = arrivalDate;
	}
	public String getBatchNumber() {
		return batchNumber;
	}
	public void setBatchNumber(String batchNumber) {
		this.batchNumber = batchNumber;
	}
	public String getContaminationControll() {
		return contaminationControll;
	}
	public void setContaminationControll(String contaminationControll) {
		this.contaminationControll = contaminationControll;
	}
	public Double getCalibrationActivity() {
		return calibrationActivity;
	}

	public void setCalibrationActivity(Double calibrationActivity) {
		this.calibrationActivity = calibrationActivity;
	}
	public Room getRoom() {
		return room;
	}
	public void setRoom(Room room) {
		this.room = room;
	}
	public Double getStartActivity() {
		return startActivity;
	}

	public void setStartActivity(Double startActivity) {
		this.startActivity = startActivity;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public void setRadiopharmaceutical(Radiopharmaceutical radiopharmaceutical) {
		this.radiopharmaceutical = radiopharmaceutical;
	}
	public Radiopharmaceutical getRadiopharmaceutical() {
		return radiopharmaceutical;
	}

	public Supplier getSupplier() {
		return supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}
	public String getCalibrationInfo() {
		LocalDate tempDate;
		String dateString;
		if(getCalibrationDate() == null ) {
			return "";
		} else {
			tempDate = getCalibrationDate().toLocalDate();
			dateString = tempDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		}
		return "MBq: "+getCalibrationActivity()+", "+dateString;
	}
@Override
public String toString() {
	// TODO Auto-generated method stub
	return "Supplier: " + supplier + ", Radio: " + radiopharmaceutical;
}

	public void print() {
		System.out.println("ID:	" + getId() + "\tSign: " + getUser().getSignature());

	}
	
}
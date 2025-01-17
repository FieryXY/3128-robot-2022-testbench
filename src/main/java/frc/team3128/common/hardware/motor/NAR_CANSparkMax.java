package frc.team3128.common.hardware.motor;

// // import com.revrobotics.RelativeEncoder;
// // import com.revrobotics.CANSparkMax;

// import com.revrobotics.RelativeEncoder;

// import edu.wpi.first.hal.SimDouble;
// import edu.wpi.first.wpilibj.simulation.SimDeviceSim;

// import frc.team3128.Robot;
// import frc.team3128.Constants.ConversionConstants;
// import frc.team3128.common.infrastructure.NAR_EMotor;
// import net.thefletcher.revrobotics.CANSparkMax;
// import net.thefletcher.revrobotics.SparkMaxRelativeEncoder;
// import net.thefletcher.revrobotics.enums.MotorType;

// public class NAR_CANSparkMax extends CANSparkMax implements NAR_EMotor {

// 	private double prevValue = 0;
// 	private SparkMaxRelativeEncoder encoder;
// 	private SimDeviceSim encoderSim;
// 	private SimDouble encoderSimVel;

// 	/**
// 	 * 
// 	 * @param deviceNumber device id
// 	 * @param type         0 for brushed motor, 1 for brushless motor
// 	 */
// 	public NAR_CANSparkMax(int deviceNumber, MotorType type) {
// 		super(deviceNumber, type);

// 		encoder = (SparkMaxRelativeEncoder) getEncoder();
// 		encoder.setPositionConversionFactor(ConversionConstants.SPARK_ENCODER_RESOLUTION); // convert rotations to encoder ticks
// 		encoder.setVelocityConversionFactor(ConversionConstants.SPARK_VELOCITY_FACTOR); // convert rpm to nu/s

// 		if(Robot.isSimulation()){
// 			encoderSim = new SimDeviceSim("CANSparkMax[" + this.getDeviceId() + "] - RelativeEncoder");
// 			encoderSimVel = encoderSim.getDouble("Velocity");
// 		}

// 		// enableVoltageCompensation(true);
// 		// configVoltageCompSaturation(12, 10);
// 	}

// 	@Override
// 	public void set(double outputValue) {
// 		if (outputValue != prevValue) {
// 			super.set(outputValue);
// 			prevValue = outputValue;
// 		}
// 	}

// 	public double getSetpoint() {
// 		return prevValue;
// 	}

// 	@Override
// 	public double getSelectedSensorPosition() {
// 		return encoder.getPosition();
// 	}

// 	@Override
// 	public double getSelectedSensorVelocity() {
// 		return encoder.getVelocity();
// 	}

// 	@Override
// 	public double getMotorOutputVoltage() {
// 		return getAppliedOutput() * getBusVoltage();
// 	}

// 	@Override
// 	public void setEncoderPosition(double encPos) {
// 		encoder.setPosition(encPos);
// 	}

// 	@Override
// 	public void setSimPosition(double pos) {
// 		encoder.setPosition(pos);
// 	}

// 	@Override
// 	public void setSimVelocity(double vel) {
// 		encoderSimVel.set(vel);
// 	}

// 	@Override
// 	public void follow(NAR_EMotor motor) {
// 		if(!(motor instanceof CANSparkMax)) {
// 			throw new RuntimeException("bad follow");
// 		}
// 		super.follow((CANSparkMax)motor);
// 	}
// }

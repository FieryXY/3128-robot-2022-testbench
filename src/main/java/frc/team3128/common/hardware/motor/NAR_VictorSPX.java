
package frc.team3128.common.hardware.motor;


import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

// To be simmed in the next implementation

public class NAR_VictorSPX extends WPI_VictorSPX{
    
    private double prevValue = 0;
    private ControlMode prevControlMode = ControlMode.Disabled;

    /**
     * @param deviceNumber device id
     */
    public NAR_VictorSPX(int deviceNumber){
        super(deviceNumber);
    }

    @Override
    public void set(ControlMode controlMode, double outputValue) {
        if (outputValue != prevValue || controlMode != prevControlMode) {
            super.set(controlMode, outputValue);
            prevValue = outputValue;
        }
    }

    public double getSetpoint() {
        return prevValue;
    }
}
    


package org.firstinspires.ftc.teamcode.mechanisms;

import com.qualcomm.robotcore.hardware.DcMotorEx;

//import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.DcMotor;

public class MotorTest {
    private DcMotorEx motorUP;
    private DcMotorEx motorIN;
    private double ticksPerRevUP;
    private double ticksPerRevIN;
    private double velocityUP;
    private double velocityIN;

    public void init(HardwareMap hwMap) {
        //motor pushes up
        motorUP = hwMap.get(DcMotorEx.class, "motorUP");
        motorUP.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        motorUP.setDirection(DcMotorEx.Direction.REVERSE);
        ticksPerRevUP = motorUP.getMotorType().getTicksPerRev();


        //motor intake
        motorIN = hwMap.get(DcMotorEx.class, "motorIN");
        motorIN.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        motorIN.setDirection(DcMotorEx.Direction.REVERSE);
        ticksPerRevIN = motorIN.getMotorType().getTicksPerRev();

    }
    public void loop() {
        velocityUP = motorUP.getVelocity();
        velocityIN = motorIN.getVelocity();
    }
    public void setMotorSpeed(double speed) {
        motorUP.setPower(speed);
        motorIN.setPower(speed);
    }
    public double getRPMup() {
        return (velocityUP * 60)/ticksPerRevUP;
    }
    public double getRPMin() {
        return (velocityIN * 60)/ticksPerRevIN;
    }

    public void setRPMSpeedUP(double rpm) {
        //6000RPM REV motor
        motorUP.setPower(rpm/6000);
    }
    public void setRPMSpeedIN(double rpm){
        motorIN.setPower(rpm/6000);
    }

}

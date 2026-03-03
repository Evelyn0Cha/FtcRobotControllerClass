package org.firstinspires.ftc.teamcode;

import org.firstinspires.ftc.teamcode.mechanisms.MotorTest;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import org.firstinspires.ftc.teamcode.mechanisms.MotorTest;

@TeleOp
public class MotorPractice extends OpMode {
    MotorTest up = new MotorTest();
    MotorTest in = new MotorTest();


    @Override
    public void init() {
        up.init(hardwareMap);
        in.init(hardwareMap);
    }

    @Override
    public void loop() {
        if (gamepad1.a) {
            up.setMotorSpeed(1);
        }

        if(gamepad1.x) {
            in.setMotorSpeed(0);

        }
    }
}

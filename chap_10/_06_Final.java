package chap_10;

import chap_10.camera.ActionCam;
import chap_10.camera.SlowActionCam;

public class _06_Final {
    public static void main(String[] args) {
        ActionCam actionCam = new ActionCam();
        // 사용자가 임의로 렌즈 변경
        // actionCam.lens = "표준 렌즈";
        actionCam.recordVideo();
        actionCam.makeVideo();
        SlowActionCam slowActionCam = new SlowActionCam();
        slowActionCam.recordVideo();
        slowActionCam.makeVideo();

    }

}

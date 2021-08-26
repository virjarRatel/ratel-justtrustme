package com.virjar.ratel.modules.justtrustme;

import com.virjar.ratel.api.inspect.JustTrustMe;
import com.virjar.ratel.api.rposed.IRposedHookLoadPackage;
import com.virjar.ratel.api.rposed.callbacks.RC_LoadPackage;

public class EnableJustTrustMe implements IRposedHookLoadPackage {
    @Override
    public void handleLoadPackage(RC_LoadPackage.LoadPackageParam lpparam) throws Throwable {
//        if (RatelToolKit.ratelVersionCode <= RatelEngineHistory.V_1_3_9) {
//            return;
//        }
        JustTrustMe.trustAllCertificate();
    }
}

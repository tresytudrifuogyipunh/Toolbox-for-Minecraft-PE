package defpackage;

import java.util.HashMap;

/* renamed from: iz2  reason: default package */
public final class iz2 implements Runnable {
    public final /* synthetic */ String P;
    public final /* synthetic */ String Q;
    public final /* synthetic */ int R;
    public final /* synthetic */ int S;
    public final /* synthetic */ oz2 T;

    public iz2(oz2 oz2Var, String str, String str2, int i, int i2) {
        this.T = oz2Var;
        this.P = str;
        this.Q = str2;
        this.R = i;
        this.S = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheProgress");
        hashMap.put("src", this.P);
        hashMap.put("cachedSrc", this.Q);
        hashMap.put("bytesLoaded", Integer.toString(this.R));
        hashMap.put("totalBytes", Integer.toString(this.S));
        hashMap.put("cacheReady", "0");
        oz2.k(this.T, hashMap);
    }
}
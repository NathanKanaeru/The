package ro.alyn_sampmobile.game;

import a1.z;
import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;
import com.google.android.material.textview.MaterialTextView;
import com.rockstargames.gtasa.GTASA;
import d.s0;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Objects;
import o7.d;
import p7.b;
import p7.c;
import p7.f;
import p7.g;
import p7.j;
import p7.k;
import p7.l;
import p7.m;
import p7.o;
import p7.p;
import p7.q;
import p7.r;
import q3.a;
import y.n;

public class SAMP extends GTASA implements o, b, j, f, l {
    private static final String TAG = a.s(-2701523853291L);
    private c buttonPanel;
    private g chat = null;
    private k dialog;
    private m heightProvider = null;
    private p keyboard;
    private q scoreboard;
    private r wantedLevel;

    private native void chatSend(String str);

    private native void initializeSAMP();

    private native void keyboardSend(byte[] bArr);

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$addChatMessage$8(SpannableString spannableString) {
        this.chat.a(spannableString);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$addClientMessage$11(SpannableString spannableString) {
        this.chat.a(spannableString);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$addDebugMessage$10(SpannableString spannableString) {
        this.chat.a(spannableString);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$addInfoMessage$9(SpannableString spannableString) {
        this.chat.a(spannableString);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$mainLoop$0() {
        this.wantedLevel.a(true);
        getSharedPreferences(a.s(-2602739605483L), 0).getBoolean(a.s(-2641394311147L), false);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$setDialogVisible$3(boolean z7) {
        this.dialog.a(z7);
    }

    /* access modifiers changed from: private */
    public void lambda$setWantedLevel$5(int i8) {
        this.wantedLevel.f14288a = i8;
    }

    /* access modifiers changed from: private */
    public void lambda$showButtonPanel$1(boolean z7) {
        int i8;
        c cVar = this.buttonPanel;
        cVar.getClass();
        if (z7) {
            i8 = 0;
        } else {
            i8 = 8;
        }
        cVar.f14240b.setVisibility(i8);
    }

    /* access modifiers changed from: private */
    public void lambda$showChat$7() {
        this.chat.f14257c.setVisibility(0);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004d, code lost:
        if (r11 == 5) goto L_0x004f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0091  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void lambda$showDialog$2(int r10, int r11, byte[] r12, byte[] r13, byte[] r14, byte[] r15) {
        /*
            r9 = this;
            p7.k r0 = r9.dialog
            android.widget.TextView r1 = r0.f14269e
            r2 = 1
            android.widget.LinearLayout r3 = r0.f14272h
            android.widget.FrameLayout r4 = r0.f14270f
            androidx.constraintlayout.widget.ConstraintLayout r5 = r0.f14268d
            r6 = 0
            r7 = 8
            if (r11 != 0) goto L_0x0023
            java.lang.String r11 = new java.lang.String
            r11.<init>(r13)
            android.text.Spanned r11 = ro.alyn_sampmobile.game.Utils.transformColors(r11)
            r1.setText(r11)
            r5.setVisibility(r6)
            r4.setVisibility(r7)
            goto L_0x0044
        L_0x0023:
            if (r11 != r2) goto L_0x002b
            java.lang.String r11 = new java.lang.String
            r11.<init>(r13)
            goto L_0x0037
        L_0x002b:
            r8 = 2
            if (r11 != r8) goto L_0x002f
            goto L_0x004f
        L_0x002f:
            r8 = 3
            if (r11 != r8) goto L_0x0048
            java.lang.String r11 = new java.lang.String
            r11.<init>(r13)
        L_0x0037:
            android.text.Spanned r11 = ro.alyn_sampmobile.game.Utils.transformColors(r11)
            r1.setText(r11)
            r5.setVisibility(r6)
            r4.setVisibility(r6)
        L_0x0044:
            r3.setVisibility(r7)
            goto L_0x0058
        L_0x0048:
            r13 = 4
            if (r11 != r13) goto L_0x004c
            goto L_0x004f
        L_0x004c:
            r13 = 5
            if (r11 != r13) goto L_0x0058
        L_0x004f:
            r5.setVisibility(r7)
            r4.setVisibility(r7)
            r3.setVisibility(r6)
        L_0x0058:
            java.lang.String r11 = new java.lang.String
            r11.<init>(r12)
            android.widget.TextView r12 = r0.f14267c
            android.text.Spanned r11 = ro.alyn_sampmobile.game.Utils.transformColors(r11)
            r12.setText(r11)
            java.lang.String r11 = new java.lang.String
            r11.<init>(r14)
            android.text.Spanned r11 = ro.alyn_sampmobile.game.Utils.transformColors(r11)
            android.widget.TextView r12 = r0.f14273i
            r12.setText(r11)
            java.lang.String r11 = new java.lang.String
            r11.<init>(r15)
            android.text.Spanned r13 = ro.alyn_sampmobile.game.Utils.transformColors(r11)
            android.widget.TextView r14 = r0.f14274j
            r14.setText(r13)
            r3 = -2770243330027(0xfffffd7b00a16015, double:NaN)
            java.lang.String r13 = q3.a.s(r3)
            boolean r11 = r11.equals(r13)
            if (r11 == 0) goto L_0x0094
            r14.setVisibility(r7)
        L_0x0094:
            p7.h r11 = new p7.h
            r11.<init>(r10, r6, r0)
            r12.setOnClickListener(r11)
            p7.h r11 = new p7.h
            r11.<init>(r10, r2, r0)
            r14.setOnClickListener(r11)
            r0.a(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ro.alyn_sampmobile.game.SAMP.lambda$showDialog$2(int, int, byte[], byte[], byte[], byte[]):void");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$showKeyboard$6(boolean z7) {
        this.keyboard.b(z7);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$showWantedLevel$4(boolean z7) {
        this.wantedLevel.a(z7);
    }

    private void mainLoop() {
        runOnUiThread(new o7.c(this, 1));
    }

    private native boolean multiTouchEvent4Ex(int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17);

    private native void sendButtonPanelKey(int i8);

    private native void sendDialogResponse(int i8, int i9, int i10, byte[] bArr);

    private void setDialogVisible(boolean z7) {
        String s8 = a.s(-1022191640555L);
        Log.i(s8, a.s(-1043666477035L) + z7);
        runOnUiThread(new o7.a(this, z7, 0));
    }

    private void setWantedLevel(int i8) {
        String s8 = a.s(-1142450724843L);
        Log.i(s8, a.s(-1163925561323L) + i8);
        runOnUiThread(new n(i8, 3, this));
    }

    private void showButtonPanel(boolean z7) {
        runOnUiThread(new o7.a(this, z7, 1));
    }

    private void showChat() {
        Log.i(a.s(-1717976342507L), a.s(-1739451178987L));
        runOnUiThread(new o7.c(this, 0));
    }

    private void showDialog(int i8, int i9, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        String s8 = a.s(-893342621675L);
        StringBuilder sb = new StringBuilder();
        sb.append(a.s(-914817458155L));
        int i10 = i8;
        sb.append(i8);
        sb.append(a.s(-987831902187L));
        sb.append(Arrays.toString(bArr));
        sb.append(a.s(-996421836779L));
        sb.append(Arrays.toString(bArr2));
        sb.append(a.s(-1005011771371L));
        sb.append(Arrays.toString(bArr3));
        sb.append(a.s(-1013601705963L));
        sb.append(Arrays.toString(bArr4));
        Log.i(s8, sb.toString());
        runOnUiThread(new d(this, i8, i9, bArr, bArr2, bArr3, bArr4));
    }

    private void showToast(String str) {
        Toast.makeText(this, str, 1).show();
    }

    private void showWantedLevel(boolean z7) {
        runOnUiThread(new o7.a(this, z7, 3));
    }

    public void _chatSend(String str) {
        String s8 = a.s(-2035803922411L);
        Log.i(s8, a.s(-2057278758891L) + str);
        chatSend(str);
    }

    public void _keyboardSend(String str) {
        byte[] bArr = new byte[0];
        try {
            bArr = str.getBytes(a.s(-1537587716075L));
        } catch (UnsupportedEncodingException e8) {
            e8.printStackTrace();
        }
        try {
            keyboardSend(bArr);
        } catch (UnsatisfiedLinkError e9) {
            String s8 = a.s(-1593422290923L);
            String message = e9.getMessage();
            Objects.requireNonNull(message);
            Log.e(s8, message);
        }
    }

    public void _sendButtonPanelKey(int i8) {
        String s8 = a.s(-1254119874539L);
        Log.i(s8, a.s(-1275594711019L) + i8);
        sendButtonPanelKey(i8);
    }

    public void _sendDialogResponse(int i8, int i9, int i10, byte[] bArr) {
        String s8 = a.s(-1382968893419L);
        Log.i(s8, a.s(-1404443729899L) + i8 + a.s(-1511817912299L) + i9 + a.s(-1520407846891L) + i10 + a.s(-1528997781483L) + Arrays.toString(bArr));
        sendDialogResponse(i8, i9, i10, bArr);
    }

    public void addChatMessage(String str, String str2, String str3) {
        StringBuilder l8 = z.l(str2);
        l8.append(a.s(-1799580721131L));
        l8.append(str);
        String sb = l8.toString();
        SpannableString spannableString = new SpannableString(sb);
        spannableString.setSpan(new ForegroundColorSpan(Color.parseColor(str3)), 0, str2.length(), 33);
        spannableString.setSpan(new ForegroundColorSpan(Color.parseColor(a.s(-1812465623019L))), str2.length(), sb.length(), 33);
        runOnUiThread(new o7.b(this, spannableString, 2));
    }

    public void addClientMessage(String str, String str2) {
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new ForegroundColorSpan(Color.parseColor(str2)), 0, str.length(), 33);
        runOnUiThread(new o7.b(this, spannableString, 3));
    }

    public void addDebugMessage(String str) {
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new ForegroundColorSpan(Color.parseColor(a.s(-1881185099755L))), 0, str.length(), 33);
        runOnUiThread(new o7.b(this, spannableString, 1));
    }

    public void addInfoMessage(String str) {
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new ForegroundColorSpan(Color.parseColor(a.s(-1846825361387L))), 0, str.length(), 33);
        runOnUiThread(new o7.b(this, spannableString, 0));
    }

    public void chatShowKeyboard(boolean z7) {
        String s8 = a.s(-1915544838123L);
        Log.i(s8, a.s(-1937019674603L) + z7);
        this.keyboard.b(z7);
    }

    public void onCreate(Bundle bundle) {
        long j2;
        Log.i(a.s(-4284391403L), a.s(-25759227883L));
        if (!Objects.equals(getIntent().getStringExtra(a.s(-85888770027L)), a.s(-141723344875L))) {
            Log.e(a.s(-188967985131L), a.s(-210442821611L));
            finish();
            return;
        }
        super.onCreate(bundle);
        Toast.makeText(this, a.s(-322111971307L), 1).show();
        if (getSharedPreferences(a.s(-412306284523L), 0).getBoolean(a.s(-450960990187L), false)) {
            try {
                System.loadLibrary(a.s(-489615695851L));
                System.loadLibrary(a.s(-506795565035L));
            } catch (ExceptionInInitializerError | UnsatisfiedLinkError e8) {
                String s8 = a.s(-528270401515L);
                String message = e8.getMessage();
                Objects.requireNonNull(message);
                Log.e(s8, message);
            }
        }
        addContentView((RelativeLayout) getLayoutInflater().inflate(R.layout.activity_game_copyright, (ViewGroup) null), new RelativeLayout.LayoutParams(-1, -1));
        ((MaterialTextView) findViewById(R.id.ahahaha)).setText(a.s(-2748768493547L));
        m mVar = new m(this);
        View GetMainView = GetMainView();
        if (!mVar.isShowing()) {
            GetMainView.post(new s0(mVar, 18, GetMainView));
        }
        mVar.f14278e = this;
        this.heightProvider = mVar;
        this.keyboard = new p(this);
        this.chat = new g(this);
        this.buttonPanel = new c(this);
        this.dialog = new k(this);
        this.scoreboard = new q(this);
        this.wantedLevel = new r(this);
        if (getSharedPreferences(a.s(-549745237995L), 0).getInt(a.s(-588399943659L), 0) == 0) {
            try {
                System.loadLibrary(a.s(-644234518507L));
            } catch (ExceptionInInitializerError | UnsatisfiedLinkError e9) {
                e = e9;
                j2 = -712953995243L;
            }
        } else if (getSharedPreferences(a.s(-734428831723L), 0).getInt(a.s(-773083537387L), 0) == 1) {
            try {
                System.loadLibrary(a.s(-828918112235L));
            } catch (ExceptionInInitializerError | UnsatisfiedLinkError e10) {
                e = e10;
                j2 = -850392948715L;
            }
        }
        try {
            initializeSAMP();
        } catch (UnsatisfiedLinkError e11) {
            String s9 = a.s(-871867785195L);
            String message2 = e11.getMessage();
            Objects.requireNonNull(message2);
            Log.e(s9, message2);
            return;
        }
        String s10 = a.s(j2);
        String message3 = e.getMessage();
        Objects.requireNonNull(message3);
        Log.e(s10, message3);
        initializeSAMP();
    }

    public void onDestroy() {
        Log.i(a.s(-2516840259563L), a.s(-2538315096043L));
        super.onDestroy();
    }

    public void onHeightChanged(int i8, int i9) {
        p pVar = this.keyboard;
        if (pVar != null) {
            RelativeLayout relativeLayout = pVar.f14286d;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) relativeLayout.getLayoutParams();
            layoutParams.setMargins(0, 0, 0, i9);
            relativeLayout.setLayoutParams(layoutParams);
        }
    }

    public void onPause() {
        Log.i(a.s(-2366516404203L), a.s(-2387991240683L));
        super.onPause();
    }

    public void onRestart() {
        Log.i(a.s(-2199012679659L), a.s(-2220487516139L));
        super.onRestart();
    }

    public void onResume() {
        Log.i(a.s(-2284912025579L), a.s(-2306386862059L));
        super.onResume();
        m mVar = this.heightProvider;
        if (mVar != null) {
            View GetMainView = GetMainView();
            if (!mVar.isShowing()) {
                GetMainView.post(new s0(mVar, 18, GetMainView));
            }
        }
    }

    public void onStart() {
        Log.i(a.s(-2121703268331L), a.s(-2143178104811L));
        super.onStart();
    }

    public void onStop() {
        Log.i(a.s(-2443825815531L), a.s(-2465300652011L));
        super.onStop();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.wantsMultitouch) {
            int pointerCount = motionEvent.getPointerCount();
            int i8 = 0;
            int i9 = 0;
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            for (int i16 = 0; i16 < pointerCount; i16++) {
                int pointerId = motionEvent.getPointerId(i16);
                if (pointerId == 0) {
                    i8 = (int) motionEvent.getX(i16);
                    i9 = (int) motionEvent.getY(i16);
                } else if (pointerId == 1) {
                    i10 = (int) motionEvent.getX(i16);
                    i11 = (int) motionEvent.getY(i16);
                } else if (pointerId == 2) {
                    i12 = (int) motionEvent.getX(i16);
                    i13 = (int) motionEvent.getY(i16);
                } else if (pointerId == 3) {
                    i14 = (int) motionEvent.getX(i16);
                    i15 = (int) motionEvent.getY(i16);
                }
            }
            try {
                multiTouchEvent4Ex(motionEvent.getActionMasked(), motionEvent.getPointerId(motionEvent.getActionIndex()), i8, i9, i10, i11, i12, i13, i14, i15);
            } catch (UnsatisfiedLinkError e8) {
                e8.printStackTrace();
            }
        } else {
            touchEvent(motionEvent.getAction(), (int) motionEvent.getX(), (int) motionEvent.getY(), motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void showKeyboard(boolean z7) {
        String s8 = a.s(-1614897127403L);
        Log.i(s8, a.s(-1636371963883L) + z7);
        runOnUiThread(new o7.a(this, z7, 2));
    }
}

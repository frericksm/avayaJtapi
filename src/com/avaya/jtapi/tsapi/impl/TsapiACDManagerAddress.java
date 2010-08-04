/*     */ package com.avaya.jtapi.tsapi.impl;
/*     */ 
/*     */ import com.avaya.jtapi.tsapi.ITsapiACDManagerAddress;
/*     */ import com.avaya.jtapi.tsapi.TsapiInvalidArgumentException;
/*     */ import com.avaya.jtapi.tsapi.TsapiMethodNotSupportedException;
/*     */ import com.avaya.jtapi.tsapi.TsapiPlatformException;
/*     */ import com.avaya.jtapi.tsapi.TsapiResourceUnavailableException;
/*     */ import com.avaya.jtapi.tsapi.csta1.LucentMonitorCallsViaDevice;
/*     */ import com.avaya.jtapi.tsapi.impl.core.TSDevice;
/*     */ import com.avaya.jtapi.tsapi.impl.core.TSProviderImpl;
/*     */ import com.avaya.jtapi.tsapi.impl.monitor.TsapiCallMonitor;
/*     */ import com.avaya.jtapi.tsapi.util.TsapiTrace;
/*     */ import java.util.Vector;
/*     */ import javax.telephony.CallObserver;
/*     */ 
/*     */ class TsapiACDManagerAddress extends TsapiAddress
/*     */   implements ITsapiACDManagerAddress
/*     */ {
/*     */   // ERROR //
/*     */   public final javax.telephony.callcenter.ACDAddress[] getACDAddresses()
/*     */     throws TsapiMethodNotSupportedException
/*     */   {return null;
/*     */     // Byte code:
/*     */     //   0: ldc 1
/*     */     //   2: aload_0
/*     */     //   3: invokestatic 2	com/avaya/jtapi/tsapi/util/TsapiTrace:traceEntry	(Ljava/lang/String;Ljava/lang/Object;)V
/*     */     //   6: aload_0
/*     */     //   7: getfield 3	com/avaya/jtapi/tsapi/impl/TsapiACDManagerAddress:tsDevice	Lcom/avaya/jtapi/tsapi/impl/core/TSDevice;
/*     */     //   10: invokevirtual 4	com/avaya/jtapi/tsapi/impl/core/TSDevice:getTSACDDevices	()Ljava/util/Vector;
/*     */     //   13: astore_1
/*     */     //   14: aload_1
/*     */     //   15: ifnonnull +16 -> 31
/*     */     //   18: ldc 1
/*     */     //   20: aload_0
/*     */     //   21: invokestatic 5	com/avaya/jtapi/tsapi/util/TsapiTrace:traceExit	(Ljava/lang/String;Ljava/lang/Object;)V
/*     */     //   24: aconst_null
/*     */     //   25: astore_2
/*     */     //   26: jsr +109 -> 135
/*     */     //   29: aload_2
/*     */     //   30: areturn
/*     */     //   31: aload_1
/*     */     //   32: dup
/*     */     //   33: astore_2
/*     */     //   34: monitorenter
/*     */     //   35: aload_1
/*     */     //   36: invokevirtual 6	java/util/Vector:size	()I
/*     */     //   39: ifne +18 -> 57
/*     */     //   42: ldc 1
/*     */     //   44: aload_0
/*     */     //   45: invokestatic 5	com/avaya/jtapi/tsapi/util/TsapiTrace:traceExit	(Ljava/lang/String;Ljava/lang/Object;)V
/*     */     //   48: aconst_null
/*     */     //   49: astore_3
/*     */     //   50: aload_2
/*     */     //   51: monitorexit
/*     */     //   52: jsr +83 -> 135
/*     */     //   55: aload_3
/*     */     //   56: areturn
/*     */     //   57: aload_1
/*     */     //   58: invokevirtual 6	java/util/Vector:size	()I
/*     */     //   61: anewarray 7	javax/telephony/callcenter/ACDAddress
/*     */     //   64: astore_3
/*     */     //   65: iconst_0
/*     */     //   66: istore 4
/*     */     //   68: iload 4
/*     */     //   70: aload_1
/*     */     //   71: invokevirtual 6	java/util/Vector:size	()I
/*     */     //   74: if_icmpge +29 -> 103
/*     */     //   77: aload_3
/*     */     //   78: iload 4
/*     */     //   80: aload_1
/*     */     //   81: iload 4
/*     */     //   83: invokevirtual 8	java/util/Vector:elementAt	(I)Ljava/lang/Object;
/*     */     //   86: checkcast 9	com/avaya/jtapi/tsapi/impl/core/TSDevice
/*     */     //   89: iconst_1
/*     */     //   90: invokestatic 10	com/avaya/jtapi/tsapi/impl/TsapiCreateObject:getTsapiObject	(Ljava/lang/Object;Z)Ljava/lang/Object;
/*     */     //   93: checkcast 7	javax/telephony/callcenter/ACDAddress
/*     */     //   96: aastore
/*     */     //   97: iinc 4 1
/*     */     //   100: goto -32 -> 68
/*     */     //   103: ldc 1
/*     */     //   105: aload_0
/*     */     //   106: invokestatic 5	com/avaya/jtapi/tsapi/util/TsapiTrace:traceExit	(Ljava/lang/String;Ljava/lang/Object;)V
/*     */     //   109: aload_3
/*     */     //   110: astore 4
/*     */     //   112: aload_2
/*     */     //   113: monitorexit
/*     */     //   114: jsr +21 -> 135
/*     */     //   117: aload 4
/*     */     //   119: areturn
/*     */     //   120: astore 5
/*     */     //   122: aload_2
/*     */     //   123: monitorexit
/*     */     //   124: aload 5
/*     */     //   126: athrow
/*     */     //   127: astore 6
/*     */     //   129: jsr +6 -> 135
/*     */     //   132: aload 6
/*     */     //   134: athrow
/*     */     //   135: astore 7
/*     */     //   137: aload_0
/*     */     //   138: aconst_null
/*     */     //   139: putfield 11	com/avaya/jtapi/tsapi/impl/TsapiACDManagerAddress:privData	Lcom/avaya/jtapi/tsapi/csta1/CSTAPrivate;
/*     */     //   142: ret 7
/*     */     //
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   35	52	120	finally
/*     */     //   57	114	120	finally
/*     */     //   120	124	120	finally
/*     */     //   6	29	127	finally
/*     */     //   31	55	127	finally
/*     */     //   57	117	127	finally
/*     */     //   120	132	127	finally
/*     */   }
/*     */ 
/*     */   private LucentMonitorCallsViaDevice createLucentMonitorCallsViaDevice()
/*     */   {
/*  74 */     TsapiTrace.traceEntry("createLucentMonitorCallsViaDevice[]", this);
/*  75 */     TSProviderImpl TSProviderImpl = this.tsDevice.getTSProviderImpl();
/*     */ 
/*  77 */     if ((TSProviderImpl != null) && 
/*  79 */       (TSProviderImpl.isLucentV7()) && (TSProviderImpl.getMonitorCallsViaDevice())) {
/*  80 */       LucentMonitorCallsViaDevice lmcvd = new LucentMonitorCallsViaDevice(true, 0);
/*  81 */       TsapiTrace.traceExit("createLucentMonitorCallsViaDevice[]", this);
/*  82 */       return lmcvd;
/*     */     }
/*     */ 
/*  85 */     TsapiTrace.traceExit("createLucentMonitorCallsViaDevice[]", this);
/*  86 */     return null;
/*     */   }
/*     */ 
/*     */   public final void addPredictiveCallObserver(CallObserver observer)
/*     */     throws TsapiMethodNotSupportedException, TsapiResourceUnavailableException
/*     */   {
/*  96 */     TsapiTrace.traceEntry("addPredictiveCallObserver[CallObserver observer]", this);
/*     */     try
/*     */     {
/*  99 */       TSProviderImpl prov = this.tsDevice.getTSProviderImpl();
/*     */ 
/* 101 */       if (prov == null)
/*     */       {
/* 103 */         throw new TsapiPlatformException(4, 0, "could not locate provider");
/*     */       }
/*     */ 
/* 107 */       Vector observers = prov.getCallMonitorThreads();
/*     */ 
/* 109 */       TsapiCallMonitor obs = null;
/* 110 */       TsapiCallMonitor obsToUse = null;
/*     */ 
/* 112 */       synchronized (observers)
/*     */       {
/* 114 */         for (int i = 0; i < observers.size(); ++i)
/*     */         {
/* 116 */           obs = (TsapiCallMonitor)observers.elementAt(i);
/* 117 */           if (obs.getObserver() != observer)
/*     */             continue;
/* 119 */           obsToUse = obs;
/* 120 */           break;
/*     */         }
/*     */ 
/* 124 */         if (obsToUse == null)
/*     */         {
/* 126 */           obsToUse = new TsapiCallMonitor(prov, observer);
/* 127 */           if (obsToUse == null)
/*     */           {
/* 129 */             throw new TsapiPlatformException(4, 0, "could not allocate Monitor wrapper");
/*     */           }
/*     */ 
/*     */         }
/*     */ 
/*     */       }
/*     */ 
/* 150 */       LucentMonitorCallsViaDevice lmcvd = createLucentMonitorCallsViaDevice();
/* 151 */       this.privData = lmcvd.makeTsapiPrivate();
/* 152 */       this.tsDevice.addAddressCallMonitor(obsToUse, true, true, this.privData);
/*     */     }
/*     */     finally
/*     */     {
/* 156 */       this.privData = null;
/*     */     }
/* 158 */     TsapiTrace.traceExit("addPredictiveCallObserver[CallObserver observer]", this);
/*     */   }
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 164 */     if (obj instanceof TsapiACDManagerAddress)
/*     */     {
/* 166 */       return this.tsDevice.equals(((TsapiACDManagerAddress)obj).tsDevice);
/*     */     }
/*     */ 
/* 170 */     return false;
/*     */   }
/*     */ 
/*     */   TsapiACDManagerAddress(TSProviderImpl TSProviderImpl, String number)
/*     */     throws TsapiInvalidArgumentException
/*     */   {
/* 178 */     super(TSProviderImpl, number);
/* 179 */     TsapiTrace.traceConstruction(this, TsapiACDManagerAddress.class);
/*     */   }
/*     */ 
/*     */   TsapiACDManagerAddress(TSDevice _tsDevice)
/*     */   {
/* 185 */     super(_tsDevice);
/* 186 */     TsapiTrace.traceConstruction(this, TsapiACDManagerAddress.class);
/*     */   }
/*     */ 
/*     */   protected void finalize()
/*     */     throws Throwable
/*     */   {
/* 192 */     super.finalize();
/* 193 */     TsapiTrace.traceDestruction(this, TsapiACDManagerAddress.class);
/*     */   }
/*     */ }

/* Location:           C:\Documents and Settings\Daniel Jurado\Meus documentos\My Dropbox\install\Avaya\jtapi-sdk-5.2.2.483\lib\ecsjtapia.jar
 * Qualified Name:     com.avaya.jtapi.tsapi.impl.TsapiACDManagerAddress
 * JD-Core Version:    0.5.4
 */
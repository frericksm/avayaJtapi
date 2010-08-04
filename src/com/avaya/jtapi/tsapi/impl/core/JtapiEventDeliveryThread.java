/*    */ package com.avaya.jtapi.tsapi.impl.core;
/*    */ 
/*    */ import com.avaya.jtapi.tsapi.impl.monitor.TsapiMonitor;
/*    */ import org.apache.log4j.Logger;
/*    */ 
/*    */ public class JtapiEventDeliveryThread
/*    */   implements Runnable
/*    */ {
/* 18 */   private static Logger log = Logger.getLogger(JtapiEventDeliveryThread.class);
/*    */   private TsapiMonitor tsapiObserver;
/*    */   private long creationTime;
/*    */ 
/*    */   public JtapiEventDeliveryThread(TsapiMonitor observer, long systemTime)
/*    */   {
/* 25 */     this.tsapiObserver = observer;
/* 26 */     this.creationTime = systemTime;
/*    */   }
/*    */ 
/*    */   public void run()
/*    */   {
/* 33 */     if (System.currentTimeMillis() - this.creationTime >= 5000L)
/* 34 */       log.info("Queue processing is very slow. Consider increasing maxThreadPoolSize property");
/* 35 */     this.tsapiObserver.run();
/*    */   }
/*    */ }

/* Location:           C:\Documents and Settings\Daniel Jurado\Meus documentos\My Dropbox\install\Avaya\jtapi-sdk-5.2.2.483\lib\ecsjtapia.jar
 * Qualified Name:     com.avaya.jtapi.tsapi.impl.core.JtapiEventDeliveryThread
 * JD-Core Version:    0.5.4
 */
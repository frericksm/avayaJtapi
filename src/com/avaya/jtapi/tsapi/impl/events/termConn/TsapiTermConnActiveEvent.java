/*    */ package com.avaya.jtapi.tsapi.impl.events.termConn;
/*    */ 
/*    */ import javax.telephony.events.TermConnActiveEv;
/*    */ 
/*    */ public final class TsapiTermConnActiveEvent extends TsapiTermConnEvent
/*    */   implements TermConnActiveEv
/*    */ {
/*    */   public int getID()
/*    */   {
/* 16 */     return 115;
/*    */   }
/*    */ 
/*    */   public TsapiTermConnActiveEvent(TermConnEventParams params)
/*    */   {
/* 23 */     super(params);
/*    */   }
/*    */ }

/* Location:           C:\Documents and Settings\Daniel Jurado\Meus documentos\My Dropbox\install\Avaya\jtapi-sdk-5.2.2.483\lib\ecsjtapia.jar
 * Qualified Name:     com.avaya.jtapi.tsapi.impl.events.termConn.TsapiTermConnActiveEvent
 * JD-Core Version:    0.5.4
 */
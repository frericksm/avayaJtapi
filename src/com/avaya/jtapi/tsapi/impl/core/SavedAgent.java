/*     */ package com.avaya.jtapi.tsapi.impl.core;
/*     */ 
/*     */ final class SavedAgent
/*     */ {
/*     */   TSAgent agent;
/*     */   long saveTime;
/*     */ 
/*     */   SavedAgent(TSAgent _agent)
/*     */   {
/* 446 */     this.agent = _agent;
/* 447 */     this.saveTime = System.currentTimeMillis();
/*     */   }
/*     */ }

/* Location:           C:\Documents and Settings\Daniel Jurado\Meus documentos\My Dropbox\install\Avaya\jtapi-sdk-5.2.2.483\lib\ecsjtapia.jar
 * Qualified Name:     com.avaya.jtapi.tsapi.impl.core.SavedAgent
 * JD-Core Version:    0.5.4
 */
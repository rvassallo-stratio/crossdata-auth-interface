/*
 * © 2017 Stratio Big Data Inc., Sucursal en España. All rights reserved.
 *
 * This software – including all its source code – contains proprietary information of Stratio Big Data Inc., Sucursal en España and may not be revealed, sold, transferred, modified, distributed or otherwise made available, licensed or sublicensed to third parties; nor reverse engineered, disassembled or decompiled, without express written authorization from Stratio Big Data Inc., Sucursal en España.
 */
package com.stratio.crossdata.security

trait CrossdataSecurityManager {

  def start() : Unit

  def stop(): Unit

  def authorize(userId: String, resource: Resource, action: Action): Boolean

  def audit(auditEvent: AuditEvent): Unit

  def filterColumns(userId: String, resources: List[Resource]): List[Resource]

  def filterRows(userId: String, resource: Resource): Option[String]

}
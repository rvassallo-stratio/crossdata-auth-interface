package com.stratio.crossdata.security

object ResourceTypeActionMapping {
  val manifest = Map(
    "datastore" -> Set("write", "bind", "manage", "audit", "viewpolicies"),
    "database" -> Set("read", "write", "create", "delete", "manage", "audit", "viewpolicies"),
    "table" -> Set("read", "write", "other", "manage", "audit", "viewpolicies"),
    "udf" -> Set("read"),
    "impersonator" -> Set("other"),
    "column" -> Set("FilterColumn"),

    "bdlDomain"  -> Set("read"),
    "bdlBusinessResource"  -> Set("insert", "read", "update", "delete","FilterRow"),
    "bdlTechnicalResource"  -> Set("insert", "read", "update", "delete","FilterRow"),
    "bdlBusinessField"  -> Set("FilterColumn"),
    "bdlTechnicalField"  -> Set("FilterColumn"),

    "FilterRow" -> Set("FilterRow"),
    "DynamicFilterRow" -> Set("DynamicFilterRow")
  )

}

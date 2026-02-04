variable "cluster_name" {
  default = "demo-eks-cluster"
}

variable "db_username" {
  default = "admin"
}

variable "db_password" {
  sensitive = true
}

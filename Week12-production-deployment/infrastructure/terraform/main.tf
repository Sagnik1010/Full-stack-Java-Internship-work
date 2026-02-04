resource "aws_vpc" "main" {
  cidr_block = "10.0.0.0/16"
}

resource "aws_eks_cluster" "eks" {
  name     = var.cluster_name
  role_arn = "arn:aws:iam::<ACCOUNT_ID>:role/<EKS_ROLE_NAME>"

  vpc_config {
    subnet_ids = [] # add subnet ids
  }
}

resource "aws_db_instance" "rds" {
  allocated_storage = 20
  engine            = "postgres"
  instance_class    = "db.t3.micro"
  name              = "appdb"
  username          = var.db_username
  password          = var.db_password
  skip_final_snapshot = true
}

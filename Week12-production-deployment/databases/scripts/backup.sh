#!/bin/bash
pg_dump -h <RDS-ENDPOINT> -U admin appdb > backup_$(date +%F).sql

#!/bin/bash
set -e

DIR="./db"
if [ -d "$DIR" ]; then
  echo "${DIR} already exists, the installation has exited ..."
  exit 1
fi
echo "Installing derby-db in ${DIR} ..."
mkdir db
cd db
curl https://apache.mirror.digionline.de//db/derby/db-derby-10.15.2.0/db-derby-10.15.2.0-bin.zip -o derbydb.zip
ls -l
unzip derbydb.zip


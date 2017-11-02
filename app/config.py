# -*- coding: utf-8 -*-
"""
Created on Thu Nov  2 09:22:26 2017

@author: TURNIEJ HS
"""

import os
basedir = os.path.abspath(os.path.dirname(__file__))

SQLALCHEMY_DATABASE_URI = 'sqlite:///' + os.path.join(basedir, 'app.db')
SQLALCHEMY_MIGRATE_REPO = os.path.join(basedir, 'db_repository')
# -*- coding: utf-8 -*-
"""
Created on Thu Nov  2 09:29:51 2017

@author: TURNIEJ HS
"""

from app import db

class Dog(db.Model):
    id = db.Column(db.Integer, primary_key=True)
    breed = db.Column(db.String(64), index=True, unique=False)
    image = db.Column(db.String(128), index=True, unique=True)


    def __repr__(self):
        return '<Dog %r>' % (self.id)
# -*- coding: utf-8 -*-
"""
Created on Thu Nov  2 08:43:39 2017

@author: TURNIEJ HS
"""

from flask import Flask, jsonify, request
from flask.json import JSONEncoder
from flask_sqlalchemy import SQLAlchemy

class MiniJSONEncoder(JSONEncoder):
    """Minify JSON output."""
    item_separator = ','
    key_separator = ':'

app = Flask(__name__)
app.config.from_object('config')
db = SQLAlchemy(app)

import models

app.json_encoder = MiniJSONEncoder
app.config['JSONIFY_PRETTYPRINT_REGULAR'] = False

@app.route('/dogs')
def dogs():
    return jsonify({dogs})
@app.route(f'/dogs/{id}')
def dog():
    return jsonify({dog})
@app.route(f'/dogs?breed={breed})
def breed():
    return jsonify({breed})

if (__name__ == '__main__'):
    app.run()
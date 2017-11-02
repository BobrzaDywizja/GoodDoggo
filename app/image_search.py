# -*- coding: utf-8 -*-
"""
Created on Thu Nov  2 10:19:57 2017

@author: TURNIEJ HS
"""

import urllib2
import simplejson

url = ('https://ajax.googleapis.com/ajax/services/search/images?' +
       'v=1.0&q=barack%20obama&userip=INSERT-USER-IP')

request = urllib2.Request(url, None, {'Referer': })
response = urllib2.urlopen(request)

# Process the JSON string.
results = simplejson.load(response)
# now have some fun with the results...
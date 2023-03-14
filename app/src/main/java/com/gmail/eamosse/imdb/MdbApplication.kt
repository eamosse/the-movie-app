package com.gmail.eamosse.imdb

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

/**
 * Point d'entrée de l'application
 * C'est la première classe (d'une application Android) qui s'exécute au lancement de l'application
 * Elle peut être considérée comme un singleton, cad il n'existe qu'une instance non nulle de cette classe
 * pendant toute la durée de vie de l'application
 */
@HiltAndroidApp
class MdbApplication : Application() {


}
name := """playapp"""
organization := "com.playapp"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.13.7"

libraryDependencies += guice

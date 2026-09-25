from pyspark.sql import SparkSession

class SparkApp :
    def __init__(self, app_name="BigDataApp"):
        self.app_name = app_name

        print(f"Memulai SparkSession untuk {self.app_name}")

        self.spark = (SparkSession.builder
                      .appName(self.app_name)
                      .master("local[*]")
                      .getOrCreate())

        self.spark.sparkContext.setLogLevel("ERROR")

        print("SparkSession siap. Versi Spark:", self.spark.version)

    def getSession(self):
        return self.spark

    def stopSession(self):
        self.spark.stop()
        print(f"Session {self.app_name} sudah dihentikan")


if __name__ == "__main__":
    my_app = SparkApp("project1")
    spark = my_app.getSession()
    df = spark.createDataFrame([("Asfa", 1), ("dani", 2)], ["name", "value"])
    df.show()
    my_app.stopSession()
import marimo

__generated_with = "0.23.5"
app = marimo.App()


@app.cell
def _():
    print("hello world")
    return


if __name__ == "__main__":
    app.run()

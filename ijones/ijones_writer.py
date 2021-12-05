def write_result_file(writer_file, result):
    with open(writer_file, "w") as result_file:
        result_file.write(str(result))
